package domain;

import java.time.Instant;

public abstract class Servicio implements Contratable{


    protected Boolean urgente;

    protected Oficio oficio;
    protected Trabajador trabajador;

    public Servicio(Oficio o, Boolean u) {
        this.oficio = o;
        this.urgente=u;
    }

    public Oficio getOficio() {
        return oficio;
    }

    public void setOficio(Oficio oficio) {
        this.oficio = oficio;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }


    //   public abstract void asignarTrabajador(Trabajador t);

   public abstract double costoServicio(Integer costo);

}
