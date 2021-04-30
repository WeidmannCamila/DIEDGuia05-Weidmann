package domain;

import java.time.Instant;

public class Trabajo implements Contratable{


    protected Trabajador trabajador;
    protected Servicio servicio;
    protected Instant fechaInicio;
    protected Instant fechaFin;
    protected Double costoTrabajo;



    public Trabajo(Trabajador t, Servicio s, Boolean u){
        this.trabajador =t;
        this.servicio=s;

        this.fechaInicio = Instant.now();

    }
    public Trabajo(Trabajador t, Servicio s){
        this.trabajador =t;
        this.servicio=s;

        this.fechaInicio = Instant.now();

    }



    public Boolean finalizado(){
        return null;
    }


}
