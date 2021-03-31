
package co.edu.unicesar.p2.practico1.modelo;


public class Pedido {

    public static int getContadorPedido() {
        return contadorPedido;
    }

    public static void setContadorPedido(int aContadorPedido) {
        contadorPedido = aContadorPedido;
    }
    private int id;
    private int nMesa;
    private String descripcion;
    private double costo;
    private Mesero mesero;
    private static int contadorPedido;

    private Pedido() {
        Pedido.contadorPedido++;
        this.id = Pedido.contadorPedido;
    }

    public Pedido(int nMesa, String descripcion, double costo, Mesero mesero) {
        this();
        this.nMesa = nMesa;
        this.descripcion = descripcion;
        this.costo = costo;
        this.mesero = mesero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getnMesa() {
        return nMesa;
    }

    public void setnMesa(int nMesa) {
        this.nMesa = nMesa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }
    
    
    
}
