package edu.pingpong.mordorcommand.procesadores;

import edu.pingpong.mordorcommand.interfaces.Pedido;
import edu.pingpong.mordorcommand.interfaces.Procesador;
import edu.pingpong.mordorcommand.interfaces.Status;
import edu.pingpong.mordorcommand.interfaces.TratamientoPedido;

public class Oficina implements Procesador{
    @Override
    public boolean procesa(TratamientoPedido tratamientoPedido) {
        return tratamientoPedido.tratar();
    }
    public String printarStatus(boolean status, Pedido pedido){
        return status ? pedido.destino() + " " + Status.ACEPTADO.name():pedido.destino() + " " + Status.RECHAZADO.name();
    }
}
