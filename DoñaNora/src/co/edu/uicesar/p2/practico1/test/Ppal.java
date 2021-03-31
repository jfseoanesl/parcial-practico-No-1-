
package co.edu.uicesar.p2.practico1.test;

import co.edu.unicesar.p2.practico1.modelo.*;
import java.util.Date;

public class Ppal {
    public static void main(String[] args) {
      Mesero meseroA = new Mesero(123, "Jairo", "Seoanes", 17);
      Mesero meseroB = meseroA;
      
      if(meseroA.equals(meseroB)){
          System.out.println("Iguales");
      }
      else{
          System.out.println("Diferentes");
      }
        
      /*System.out.println("Creacion de Jornada Laboral: ");
      JornadaLaboral jornada = new JornadaLaboral(3, 0.1, new Date());
      
      Mesero meseroA = new Mesero(123, "Jairo", "Seoanes", 17);
      Mesero meseroB = new Mesero(345, "luis", "Diaz", 25);
      Mesero meseroC = new Mesero(567, "Alfonso", "Garcia", 30);
      Mesero meseroD = new Mesero(789, "Francisco", "Martinez", 18);
      Mesero meseroE = new Mesero(987, "Jose", "Lopez", 40);
      
      System.out.println("\n Registro de Meseros: ");
      contratarMesero(jornada, meseroA);
      contratarMesero(jornada, meseroB);
      contratarMesero(jornada, meseroC);
      contratarMesero(jornada, meseroD);
      contratarMesero(jornada, meseroE);
      
      System.out.println("\n Registro de Pedidos: ");
      registrarPedido(jornada, 1, "Salchipapa", 10000, meseroB);
      registrarPedido(jornada, 2, "Perro Caliente", 5000, meseroC);
      registrarPedido(jornada, 3, "Sandwich Cubano", 8000, meseroD);
      registrarPedido(jornada, 4, "Desgranado", 12000, meseroB);
      registrarPedido(jornada, 5, "Hamburguesa", 10000, meseroC);
      
      System.out.println("\nInforme Cierre Jornada: ");      
      informeCierreJornada(jornada);
      */  
    }
    
    public static void informeCierreJornada(JornadaLaboral jornada){
        
        for(int i=0; i<jornada.getnMeseros();i++){
            Mesero m = jornada.getMeserosContratados()[i];
            double valorTotalPedidos = 0;
            int pedidosRealizados = 0;
            double pagoMesero;
            for(int j=0; j<jornada.getnPedidos(); j++){
                Pedido p = jornada.getPedidosRegistrados()[j];
                if(p.getMesero().equals(m)){
                    valorTotalPedidos += p.getCosto();
                    pedidosRealizados ++;
                }
            }
            pagoMesero = valorTotalPedidos * jornada.getPropina();
            
            System.out.println(m.datosMesero()+", Pedidos realizados: " + pedidosRealizados + 
                    ", CostoTotal Pedidos: " + valorTotalPedidos + ", Valor a Pagar: " + pagoMesero);
        }
    }
    
    public static void registrarPedido(JornadaLaboral jornada, int nMesa, String descripcion, double costo, Mesero mesero){
        if(jornada.isLimitePedido()){
            System.out.println("No es posible registrar pedido, ya se cumplio el limite");
        }
        else{
            int noPedido = jornada.adicionarPedido(nMesa, descripcion, costo, mesero);
            System.out.println("Pedido registrado con el id: " + noPedido);
        }
        
    }
    
    public static void contratarMesero(JornadaLaboral jornada, Mesero mesero){
        if(jornada.isLimiteMesero()){
            System.out.println("No es posible contratar el mesero, se cumplio con el limite requerido");
        }
        else if(mesero.isMayorEdad()){
            jornada.adicionarMesero(mesero);
            System.out.println("Mesero registrado con exito");
        }
        else{
            System.out.println("No es posible contratar el mesero, es menor de edad");
        }
    }
}
