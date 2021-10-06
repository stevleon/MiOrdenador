package com.ceep.dominio;

public class Orden {
   private final int idOrden;
   Computadoras computadora[]; 
   private static int ContadorOrdenes;
   private static int ContadorComputadoras;
   private static final int MAX_COMPUTADORAS = 4;
   
    public Orden(){
        ContadorComputadoras = 0;
        computadora = new Computadoras[Orden.MAX_COMPUTADORAS];
        this.idOrden = ++ContadorOrdenes;
    }
    
    public void agregarComputadoras(Computadoras Computadora){
        if (ContadorComputadoras < MAX_COMPUTADORAS){
            this.computadora[ContadorComputadoras++] = Computadora;
        } else{
            System.out.println("No se pueden agregar mas computadoras, has"
                    + "llegado al limite de " + MAX_COMPUTADORAS
                    + " computadoras por orden.");
        }
    }
    
    
    public void mostrarOrden(){
        System.out.println("Id de Orden: " + this.idOrden);
        for(int i = 0; i < ContadorComputadoras; i++ ){
            System.out.println(computadora[i]);
            
        }
        
    }
}
