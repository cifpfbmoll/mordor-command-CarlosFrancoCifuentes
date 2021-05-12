package edu.pingpong.mordorcomand.tratamientos;

import edu.pingpong.mordorcomand.interfaces;

public class PedidoInternacional implements Pedido {
    private final String id;
    private String destino;
    private int peso;

    public PedidoInternacional(String destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String destino() {
        return this.destino;
    }

}
