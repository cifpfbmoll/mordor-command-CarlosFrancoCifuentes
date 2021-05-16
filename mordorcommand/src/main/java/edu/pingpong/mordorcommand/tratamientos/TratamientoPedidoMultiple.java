package edu.pingpong.mordorcommand.tratamientos;

import java.util.Set;

import edu.pingpong.mordorcommand.interfaces.Pedido;
import edu.pingpong.mordorcommand.interfaces.TratamientoPedido;

public class TratamientoPedidoMultiple implements TratamientoPedido{
    private Integer pesoTotal = 0;
    private int numBultos = 0;
    private Set<Pedido> listaPedidos;

    public TratamientoPedidoMultiple(Set<Pedido> listaPedidos){
        this.listaPedidos = listaPedidos;
    }

    public void calcularPesoTotal(){
        for(Pedido pedido : listaPedidos){
            this.pesoTotal += pedido.peso();
        }
    }

    public void calcularBultosTotal(){
        this.numBultos = listaPedidos.size();
    }

    public int getNumBultos() {
        return this.numBultos;
    }

    public Integer getPesoTotal() {
        return this.pesoTotal;
    }

    @Override
    public boolean tratar() {
        calcularBultosTotal();
        calcularPesoTotal();
        if (pesoTotal > 0 && numBultos == listaPedidos.size()){
            return true;
        }
        else {
            return false;
        }
    }
}
