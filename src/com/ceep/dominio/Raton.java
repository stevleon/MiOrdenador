package com.ceep.dominio;

public class  Raton extends DispositivoEntrada{
    private final  int idRaton;
    private static int ContadorRatones;
    
    
    
    public Raton(String TipoEntrada, String marca) {
        super(TipoEntrada, marca);
        this.idRaton = ++Raton.ContadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" + "idRaton=" + idRaton + '}';
    }
   
    
}
