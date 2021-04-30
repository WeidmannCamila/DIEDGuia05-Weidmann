package domain;

public abstract class Estandar extends Servicio {

    private Double costo;

    public Estandar(Oficio o, Boolean u, Double c){
        super(o,u);
        this.costo =c;
    }


    public double costoServicio(Trabajador t) {
        double aux = 0.0;
        aux = super.trabajador.getComision() + costo;

        if (this.urgente == true) {
            return aux * 1.5;
        } else {
            return aux;
        }

    }


}
