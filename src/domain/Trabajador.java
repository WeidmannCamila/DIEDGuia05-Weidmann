package domain;

import java.util.List;

public class Trabajador {
    private String nombre;
    private String correo;
    private List<Trabajo> trabajosAsignados;
    private String oficio;
    private Double costo;
    private Double comision;


    public Trabajador(String n, String c, String o, Double cxd ){
        this.nombre = n;
        this.correo= c;
        this.oficio= o;
        this.costo= cxd;

    }

    public Double getComision() {
        return comision;
    }







}
