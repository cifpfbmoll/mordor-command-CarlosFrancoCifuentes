package edu.pingpong.mordorcommand.tratamientos;

import edu.pingpong.mordorcommand.interfaces.TratamientoPedido;
import edu.pingpong.mordorcommand.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido{
    
    private final PedidoInternacional pedidoInternacional;

    public TratamientoPedidoInternacional(PedidoInternacional pedidoInternacional){
        this.pedidoInternacional = pedidoInternacional;
    }

    @Override
    public boolean tratar() {
        return ! pedidoInternacional.destino().equals("Mordor");
    }

    public PedidoInternacional getPedidoInternacional() {
        return this.pedidoInternacional;
    }
}
    
