package restaurante.fachada;

import restaurante.dados.cardapio.Item;

import restaurante.dados.pedido.Pedido;
import restaurante.exception.*;
import restaurante.negocios.ControladorRepositorioPedido;
import restaurante.negocios.ControladorVetorMesa;
import restaurante.repositorio.*;

import restaurante.negocios.ControladorRepositorioItem;

import java.io.FileNotFoundException;






public class Fachada implements IFachada{


  private ControladorRepositorioItem controladorRepositorioItem;
  private ControladorVetorMesa controladorVetorMesaMesa;
  private ControladorRepositorioPedido controladorRepositorioPedido;
  
  private static Fachada instancia=null;

  public static Fachada getInstancia()//singleton
  {  
    if(instancia==null)
       instancia = new Fachada();
    return instancia;
  }

  private Fachada()
  {
    IRepositorioCardapio repositorioCardapio = new RepositorioCardapio();
    VetorMesas vetorMesas = new VetorMesas();
    IRepositorioPedido iRepositorioPedido = new RepositorioPedido();
    controladorRepositorioPedido = new ControladorRepositorioPedido(iRepositorioPedido);
    controladorVetorMesaMesa = new ControladorVetorMesa(vetorMesas);
    controladorRepositorioItem = new ControladorRepositorioItem(repositorioCardapio);


  }



  @Override
  public Item consultarItem(String codigo) throws ItemInexistenteException {
    return controladorRepositorioItem.consultarItem(codigo);
  }

  @Override
  public void inserir(Item item) throws ItemJaExistenteException {
      controladorRepositorioItem.inserir(item);
  }

  @Override
  public void remover(String codigo) throws ItemInexistenteException {
      controladorRepositorioItem.remover(codigo);
  }

  @Override
  public void alterarPreco(String codigo, double valor) throws PrecoInvalidoException, ItemInexistenteException {
      controladorRepositorioItem.alterarPreco(codigo,valor);
  }

  @Override
  public void lerCardapio() throws FileNotFoundException, ItemJaExistenteException {
      controladorRepositorioItem.lerCardapio();
  }

  @Override
  public void salvarAlteracoesItem() {
    controladorRepositorioItem.salvarAlteracoesItem();
  }

  @Override
  public void listarItens() {
    controladorRepositorioItem.listarItens();
  }

  @Override
  public void inserirPedido(Pedido pedido)
  {
    this.controladorRepositorioPedido.inserirPedido(pedido);
  }

  @Override
  public void encerrarPedido(Pedido pedido) {// deve gravar no arquivo
    this.controladorRepositorioPedido.encerrarPedido(pedido);
  }

  @Override
  public void pagar()//deve gravar o preço no arquivo de pedidos encerrados
  {
    this.controladorRepositorioPedido.pagar();
  }


  @Override
  public void inserirItem(Pedido pedido, Item item) {//deve gravar no arquivo
    this.controladorRepositorioPedido.inserirItem(pedido,item);

  }

  @Override
  public void removerItem(Pedido pedido, Item item) {//deve gravar no arquivo
    this.controladorRepositorioPedido.removerItem(pedido,item);
  }

  @Override
  public void lerPedido() {// deve ler os dados do pedido e copiar para uma lista, com o preço e tudo.
    this.controladorRepositorioPedido.lerPedido();
  }

  @Override
  public void salvarAlteracoesPedido() {
    this.controladorRepositorioPedido.salvarAlteracoesPedido();
  }

  @Override
  public void listarPedidos() {
    this.controladorRepositorioPedido.listarPedidos();
  }
}
