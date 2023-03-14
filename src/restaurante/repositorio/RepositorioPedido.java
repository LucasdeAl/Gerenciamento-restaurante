package restaurante.repositorio;

import restaurante.dados.cardapio.Item;
import restaurante.dados.pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPedido implements IRepositorioPedido {

    private List<Pedido> pedidos = new ArrayList<>();
    //private static int indice = 0;


    @Override
    public void inserirPedido(Pedido pedido) {
        pedidos.add(pedido);
        // deve gravar no arquivo
    }


    @Override
    public void encerrarPedido(Pedido pedido) {// deve gravar no arquivo
        pagar();
        pedido.setPedidoEncerrado(true);
        pedidos.remove(pedido);

    }

    /**
     *
     */
    @Override
    public void pagar()//deve gravar o preço no arquivo de pedidos encerrados
    {

    }


    @Override
    public void inserirItem(Pedido pedido, Item item) {//deve gravar no arquivo
        pedido.inserirItem(item);

    }

    @Override
    public void removerItem(Pedido pedido, Item item) {//deve gravar no arquivo
        pedido.removerItem(item);
    }

    @Override
    public void lerPedido() {// deve ler os dados do pedido e copiar para uma lista, com o preço e tudo.

    }

    @Override
    public void salvarAlteracoes() {

    }

    @Override
    public void listarPedidos() {

    }
}