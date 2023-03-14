package restaurante.negocios;

import restaurante.repositorio.IRepositorioCardapio;
import restaurante.exception.ItemInexistenteException;
import restaurante.exception.ItemJaExistenteException;
import restaurante.exception.PrecoInvalidoException;
import restaurante.dados.cardapio.Item;
import restaurante.repositorio.RepositorioCardapio;

import java.io.FileNotFoundException;
import java.util.Collection;

public class ControladorRepositorioItem {

    private IRepositorioCardapio repositorioCardapio;

    public ControladorRepositorioItem(IRepositorioCardapio repositorioCardapio) {
        this.repositorioCardapio = repositorioCardapio;
    }

    public Item consultarItem(String codigo) throws ItemInexistenteException {
        return repositorioCardapio.consultar(codigo);
    }

    public void inserir(Item item) throws ItemJaExistenteException {
        repositorioCardapio.inserir(item);
    }

    public void remover(String codigo) throws ItemInexistenteException {
        repositorioCardapio.remover(codigo);
    }

    public void alterarPreco(String codigo, double valor) throws PrecoInvalidoException, ItemInexistenteException {
        repositorioCardapio.alterarPreco(codigo, valor);
    }

    public void lerCardapio() throws FileNotFoundException, ItemJaExistenteException{
        repositorioCardapio.lerCardapio();
    }

    public void salvarAlteracoesItem(){
        repositorioCardapio.salvarAlteracoes();
    }

    public void listarItens() {
        repositorioCardapio.listarItens();
    }

}
