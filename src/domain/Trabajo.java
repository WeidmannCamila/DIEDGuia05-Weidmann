package domain;

import exceptions.AgendaOcupadaException;
import exceptions.OficioNoCoincideException;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.List;

public class Trabajo implements Contratable {


    protected Trabajador trabajador;
    protected Servicio servicio;


    protected Instant fechaInicio;
    protected Instant fechaFin;
    protected Double costoTrabajo;
    protected Oficio oficio;
    private List<Trabajo> trabajosAsignados;


    public Trabajo(Trabajador t, Servicio s, Boolean u, Oficio o) {
        this.trabajador = t;
        this.servicio = s;
        this.oficio = o;
        this.fechaInicio = Instant.now();

    }

    public Trabajo(Trabajador t, Servicio s) {
        this.trabajador = t;
        this.servicio = s;

        this.fechaInicio = Instant.now();

    }


    public Boolean finalizado() {
        return null;
    }


    public Instant getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Instant fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}
