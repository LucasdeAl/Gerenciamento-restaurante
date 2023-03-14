package restaurante.repositorio;

import restaurante.repositorio.IRepositorioCardapio;
import restaurante.exception.ItemInexistenteException;
import restaurante.exception.ItemJaExistenteException;
import restaurante.exception.PrecoInvalidoException;
import restaurante.dados.cardapio.Item;

import java.io.FileNotFoundException;

public interface IRepositorioCardapio {

    public void inserir(Item item) throws ItemJaExistenteException;

    public void remover(String codigo) throws ItemInexistenteException;

    public void alterarPreco(String codigo, double valor) throws PrecoInvalidoException, ItemInexistenteException;

    public Item consultar(String codigo) throws ItemInexistenteException;

    public void lerCardapio() throws FileNotFoundException, ItemJaExistenteException;

    public void salvarAlteracoes();

    public void listarItens();

}
