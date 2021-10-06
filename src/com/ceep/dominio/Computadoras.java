package com.ceep.dominio;

public class Computadoras {
    private  final int idComputadora;
    private String nombre; 
    private Monitor monitor;
    private Teclado teclado; 
    private Raton raton; 
    private static int contadorComputadoras;
    
    public Computadoras(){
           this.idComputadora = ++contadorComputadoras;
    }

    public Computadoras(String nombre,Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre; 
        this.monitor = monitor;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadoras.contadorComputadoras = contadorComputadoras;
    }

    @Override
    public String toString() {
        return "Computadoras{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
}
