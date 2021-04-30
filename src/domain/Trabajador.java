package domain;

import exceptions.AgendaOcupadaException;
import exceptions.OficioNoCoincideException;

import java.time.Duration;
import java.util.List;

public class Trabajador {
    private String nombre;
    private String correo;
    private List<Trabajo> trabajosAsignados;
    private Oficio oficio;
    private Double costo;
    private Double comision;


    public Trabajador(String n, String c, Oficio o, Double cxd ){
        this.nombre = n;
        this.correo= c;
        this.oficio= o;
        this.costo= cxd;

    }

    public Double getComision() {
        return comision;
    }




    public void asignarTrabajo(Trabajo trab) throws OficioNoCoincideException, AgendaOcupadaException {

        Oficio oficioT = trab.oficio;
        Oficio oficioS= this.oficio;
        if( oficioT!= oficioS) {
            throw new OficioNoCoincideException();
        }else
            for(Trabajo t2 : trabajosAsignados) {
                if(Duration.between(t2.getFechaInicio(),trab.getFechaInicio()).toDays() == 0)
                    throw new AgendaOcupadaException();
            }
        this.insertTrabajo(trab);
    }






    public void insertTrabajo(Trabajo t){
        trabajosAsignados.add(t);
    }



}
