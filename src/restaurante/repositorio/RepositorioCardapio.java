package restaurante.repositorio;

import restaurante.repositorio.IRepositorioCardapio;
import restaurante.exception.ItemInexistenteException;
import restaurante.exception.ItemJaExistenteException;
import restaurante.exception.PrecoInvalidoException;
import restaurante.dados.cardapio.Item;

import java.io.FileNotFoundException;

import java.io.*;
import java.util.*;

public class RepositorioCardapio implements IRepositorioCardapio{

    private List<Item> itensCardapio = new ArrayList<>();

    @Override
    public void inserir(Item item) throws ItemJaExistenteException {
        try {
            if(consultar(item.getCodigo()) != null)
                throw new ItemJaExistenteException();
        } catch (ItemInexistenteException ex) {
            itensCardapio.add(item);
        }

        salvarAlteracoes();
    }

    @Override
    public void remover(String codigo) throws ItemInexistenteException {
        try{
            Item itemRemover = consultar(codigo);
            if(itemRemover != null) this.itensCardapio.remove(itemRemover);
        }catch(ItemInexistenteException ex){
            throw ex;
        }

        salvarAlteracoes();
    }

    @Override
    public void alterarPreco(String codigo, double valor) throws PrecoInvalidoException, ItemInexistenteException {
        try {
            Item itemAlterar = consultar(codigo);
            if (itemAlterar != null){
                if (valor > 0){
                    itemAlterar.setValor(valor);
                }else{
                    throw new PrecoInvalidoException();
                }
            }
        }catch (ItemInexistenteException ex){
            throw ex;
        }

        salvarAlteracoes();
    }

    @Override
    public Item consultar(String codigo) throws ItemInexistenteException {
        Item itemBuscado = null;
        for(Item item : this.itensCardapio){
            if(item.getCodigo().equals(codigo)){
                itemBuscado = item;
                break;
            }
        }
        if(itemBuscado == null) throw new ItemInexistenteException();
        return itemBuscado;
    }

    @Override
    public void lerCardapio() throws FileNotFoundException, ItemJaExistenteException{ //converter o arquivo csv para uma arraylist
        //codigo, nome, tipo, valor

        Scanner scanner = new Scanner(new File("Cardapio.txt"));

        while (scanner.hasNext()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(", ");

            String valor1 = linhaScanner.next();
            String valor2 = linhaScanner.next();
            String valor3 = linhaScanner.next();
            double valor4 = linhaScanner.nextDouble();

            Item item = new Item(valor1, valor2, valor3, valor4);
            try{
                inserir(item);
            }catch (ItemJaExistenteException ex){
                ex.printStackTrace();
            }

        }
    }

    @Override
    public void salvarAlteracoes(){

        try{
            FileWriter fw = new FileWriter("Cardapio.txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

//            pw.println();

            for (Item item : this.itensCardapio) {
                pw.println(item.getCodigo() + ", " + item.getNome() + ", " + item.getTipo() + ", " + item.getValor());
            }

            pw.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void listarItens() { //passar a arraylist para csv
        for (int i = 0; i < itensCardapio.size(); i++) {
            System.out.println(itensCardapio.get(i));
        }
    }
}
