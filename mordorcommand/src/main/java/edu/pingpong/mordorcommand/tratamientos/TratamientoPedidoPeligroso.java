package edu.pingpong.mordorcommand.tratamientos;

import edu.pingpong.mordorcommand.interfaces.PedidoPeligroso;
import edu.pingpong.mordorcommand.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {
    private PedidoPeligroso pedidoPeligroso;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedidoPeligroso) {
        this.pedidoPeligroso = pedidoPeligroso;
    }

    @Override
    public boolean tratar() {
        return ! pedidoPeligroso.destino().equals("No ponerselo en el dedo");
    }

    public PedidoPeligroso getPedidoPeligroso() {
        return this.pedidoPeligroso;
    }
}
