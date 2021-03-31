/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicesar.p2.practico1.modelo;

import java.util.Date;

/**
 *
 * @author jairo
 */
public class JornadaLaboral {
    private int N_MAX_MESEROS;
    private final int LIMITE_PEDIDOS = 50;
    private double propina;
    private Date fecha;
    private Mesero meserosContratados[];
    private Pedido pedidosRegistrados[];
    private int nMeseros, nPedidos;

    public JornadaLaboral(int N_MAX_MESEROS, double propina, Date fecha) {
        this.N_MAX_MESEROS = N_MAX_MESEROS;
        this.propina = propina;
        this.fecha = fecha;
        this.meserosContratados = new Mesero[this.N_MAX_MESEROS];
        this.pedidosRegistrados = new Pedido[this.LIMITE_PEDIDOS];
        this.nMeseros=0;
        this.nPedidos=0;
    }

    public int getN_MAX_MESEROS() {
        return N_MAX_MESEROS;
    }

    public void setN_MAX_MESEROS(int N_MAX_MESEROS) {
        this.N_MAX_MESEROS = N_MAX_MESEROS;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Mesero[] getMeserosContratados() {
        return meserosContratados;
    }

    public void setMeserosContratados(Mesero[] meserosContratados) {
        this.meserosContratados = meserosContratados;
    }

    public Pedido[] getPedidosRegistrados() {
        return pedidosRegistrados;
    }

    public void setPedidosRegistrados(Pedido[] pedidosRegistrados) {
        this.pedidosRegistrados = pedidosRegistrados;
    }

    public int getnMeseros() {
        return nMeseros;
    }

    public void setnMeseros(int nMeseros) {
        this.nMeseros = nMeseros;
    }

    public int getnPedidos() {
        return nPedidos;
    }

    public void setnPedidos(int nPedidos) {
        this.nPedidos = nPedidos;
    }
    
    public void adicionarMesero(Mesero m){
        this.meserosContratados[this.nMeseros]=m;
        this.nMeseros++;
    }
    
    public boolean isLimiteMesero(){
        return this.nMeseros>=this.N_MAX_MESEROS;
    }
    
    public int adicionarPedido(int nMesa, String descripcion, double costo, Mesero mesero){
        Pedido p = new Pedido(nMesa, descripcion, costo, mesero);
        this.pedidosRegistrados[this.nPedidos] = p;
        this.nPedidos++;
        return p.getId();
    }
    
    public boolean isLimitePedido(){
        return this.nPedidos>=this.LIMITE_PEDIDOS;
    }
    
    
    
}
