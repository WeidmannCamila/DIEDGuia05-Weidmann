package domain;

public class Personalizado extends Servicio {


    protected Double costoPresupuestado;
    protected Double costoMateriales;
    protected Double costoTransporte;

    public Personalizado(Oficio o, Boolean u, Double cp, Double cm, double ct) {
        super(o,u);
        this.costoPresupuestado = cp;
        this.costoMateriales = cm;
        this.costoTransporte = ct;

    }


    @Override
    public double costoServicio(Integer costo) {
       Double aux = 0.0;
       aux = this.costoPresupuestado+this.costoMateriales+this.costoTransporte;

        if (this.urgente == true) {
            return aux * 1.5;
        } else {
            return aux;
        }

        }
}
