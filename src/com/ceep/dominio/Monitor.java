package com.ceep.dominio;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int ContadorMonitores;
    
    public Monitor(){
        this.idMonitor = ++ContadorMonitores;
    }
    
    public Monitor(String marca, double tamaño){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamanio() {
        return tamanio;
    }
   

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContadorMonitores() {
        return ContadorMonitores;
    }

    public static void setContadorMonitores(int ContadorMonitores) {
        Monitor.ContadorMonitores = ContadorMonitores;
    }
    
    

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamanio + '}';
    }
}
