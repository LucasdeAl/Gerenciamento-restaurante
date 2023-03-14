package restaurante.fachada;

import restaurante.dados.cardapio.Item;

import restaurante.exception.*;

import java.io.FileNotFoundException;

import restaurante.dados.pedido.Pedido;
public interface IFachada
{
    public Item consultarItem(String codigo) throws ItemInexistenteException;
    public void inserir(Item item) throws ItemJaExistenteException;
    public void remover(String codigo) throws ItemInexistenteException;

    public void alterarPreco(String codigo, double valor) throws PrecoInvalidoException, ItemInexistenteException;
    public void lerCardapio() throws FileNotFoundException, ItemJaExistenteException;

    public void salvarAlteracoesItem();
    public void listarItens();

    public void inserirPedido(Pedido pedido);
    public void encerrarPedido(Pedido pedido);

    public void pagar();
    public void inserirItem(Pedido pedido, Item item);
    public void removerItem(Pedido pedido, Item item);

    public void lerPedido();
    public void listarPedidos();
    public void salvarAlteracoesPedido();
}