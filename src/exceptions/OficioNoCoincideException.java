package exceptions;


import domain.Oficio;

public class OficioNoCoincideException extends Exception{

    public OficioNoCoincideException(Oficio oficioTrabajador, Oficio oficioS) {
        super("El oficio " + oficioS.getNombre() + " no coincide con el oficio del trabajador (" + oficioTrabajador.getNombre() + ").");
    }

    public OficioNoCoincideException() {

    }
}