package domain;

import java.time.Instant;

public abstract class Servicio implements Contratable{


   // abstract Integer costo;
    protected String oficio;
    protected Trabajador trabajador;


    public abstract void asignarTrabajador(Trabajador t);

    public abstract void costoServicio(Integer costo);

}
