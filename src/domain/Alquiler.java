package domain;

import java.time.Duration;
import java.time.Instant;

public class Alquiler implements Contratable {

    protected Instant fechaInicio;
    protected Instant fechaFin;
    protected Instant fechaDevolucion;
    protected Herramienta herramienta;



    public final void iniciar(){
        this.fechaInicio = Instant.now();

    }
    public final void iniciar(Instant fechaIni){
        this.fechaInicio = fechaIni;

    }

    public final void devolucion (){
        this.fechaDevolucion = Instant.now();
    }

    public boolean finalizado(){
        return this.fechaDevolucion != null;
    }


   public final long DiasAlquiler(){
        return Duration.between(fechaInicio, fechaFin).toDays();
   }

    public float costo(){
        return this.herramienta.getCostoxdia()*this.DiasAlquiler();

    }



}
