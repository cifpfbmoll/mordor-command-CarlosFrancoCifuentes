package edu.pingpong.mordorcommand.pedidos;

import java.util.UUID;

import edu.pingpong.mordorcommand.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso{
    private final String id;
    private String destino;
    private int peso;
    private String instrucciones;

    public PedidoPeligrosoOrden(String destino, String instrucciones){
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.instrucciones = instrucciones;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    @Override
    public String instrucciones() {
        return this.instrucciones;
    }

    public String getId() {
        return this.id;
    }
}
