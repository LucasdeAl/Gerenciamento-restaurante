package restaurante.negocios;

import restaurante.dados.cardapio.Item;
import restaurante.dados.pedido.Pedido;
import restaurante.repositorio.IRepositorioPedido;

public class ControladorRepositorioPedido {
    private IRepositorioPedido iRepositorioPedido;

    public ControladorRepositorioPedido(IRepositorioPedido iRepositorioPedido)
    {
        this.iRepositorioPedido=iRepositorioPedido;
    }

    public void inserirPedido(Pedido pedido)
    {
        this.iRepositorioPedido.inserirPedido(pedido);
    }


    public void encerrarPedido(Pedido pedido) {// deve gravar no arquivo
        this.iRepositorioPedido.encerrarPedido(pedido);
    }
    public void pagar()//deve gravar o preço no arquivo de pedidos encerrados
    {
        this.iRepositorioPedido.pagar();
    }



    public void inserirItem(Pedido pedido, Item item) {//deve gravar no arquivo
        this.iRepositorioPedido.inserirItem(pedido,item);

    }


    public void removerItem(Pedido pedido, Item item) {//deve gravar no arquivo
        this.iRepositorioPedido.removerItem(pedido,item);
    }


    public void lerPedido() {// deve ler os dados do pedido e copiar para uma lista, com o preço e tudo.
        this.iRepositorioPedido.lerPedido();
    }


    public void salvarAlteracoesPedido() {
        this.iRepositorioPedido.salvarAlteracoes();
    }


    public void listarPedidos() {
        this.iRepositorioPedido.listarPedidos();
    }
}
