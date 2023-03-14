package restaurante.dados.pedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import restaurante.dados.cardapio.Item;


public abstract class Pedido {

    protected ArrayList<Item> itens;
    protected String formaPagamento;
    protected LocalDateTime horaPedido;
    protected boolean pedidoEncerrado;
    protected double valor = 0.0;

    public Pedido() {
        this.itens = null;
        this.horaPedido = LocalDateTime.now();
        this.formaPagamento = null;
        this.pedidoEncerrado = false;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public LocalDateTime getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalDateTime horaPedido) {
        this.horaPedido = horaPedido;
    }

    public boolean isPedidoEncerrado() {
        return pedidoEncerrado;
    }

    public void setPedidoEncerrado(boolean pedidoEncerrado) {
        this.pedidoEncerrado = pedidoEncerrado;
    }
    
    public void inserirItem(Item item)
    {
        itens.add(item);
        valor = valor + item.getValor();
    }

    public void removerItem(Item item){
        itens.remove(item);
        valor = valor - item.getValor();
    }
}
