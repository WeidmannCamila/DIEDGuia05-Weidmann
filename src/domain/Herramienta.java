package domain;

import java.time.Instant;

public class Herramienta{

    protected String nombre;


    protected Float costoxdia;
    protected Instant fechaDevolucion;


    public Herramienta(String nom, Float costo){
        this.costoxdia=costo;
        this.nombre=nom;

    }

    public Float getCostoxdia() {
        return costoxdia;
    }


   // public String toString(){
     //   ret
    //}

}
