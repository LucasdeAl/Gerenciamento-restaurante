package restaurante.dados.pedido;

import restaurante.dados.cardapio.Item;
import restaurante.dados.mesa.Mesa;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PedidoMesa extends Pedido{
    private Mesa mesa;

    public PedidoMesa(Mesa mesa) {
        super();
        this.mesa=mesa;
    }
}
