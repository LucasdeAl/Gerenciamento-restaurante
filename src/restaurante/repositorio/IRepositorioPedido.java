package restaurante.repositorio;

import restaurante.dados.pedido.Pedido;
import restaurante.repositorio.IRepositorioCardapio;
import restaurante.exception.ItemInexistenteException;
import restaurante.exception.ItemJaExistenteException;
import restaurante.exception.PrecoInvalidoException;
import restaurante.dados.cardapio.Item;

import java.io.FileNotFoundException;

public interface IRepositorioPedido {

    public void inserirPedido(Pedido pedido);
    public void encerrarPedido(Pedido pedido);

    public void pagar();

    public void inserirItem(Pedido pedido, Item item);

    public void removerItem(Pedido pedido, Item item);

    public void lerPedido();//copia arquivo txt para o arraylist

    public void salvarAlteracoes();// registra o pedido no arquivp txt

    public void listarPedidos();// lista os pedidos registrados

}
