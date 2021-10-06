package com.ceep.dominio;

public class DispositivoEntrada extends Object{
    private String TipoEntrada;
    private String marca;
    
    public DispositivoEntrada(String TipoEntrada, String marca){
        this.TipoEntrada = TipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return TipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setTipoEntrada(String TipoEntrada) {
        this.TipoEntrada = TipoEntrada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "TipoEntrada=" + TipoEntrada + ", marca=" + marca + '}';
    }
    
    
}
