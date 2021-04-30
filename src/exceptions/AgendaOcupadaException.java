package exceptions;

import domain.Trabajador;
import domain.Trabajo;

public class AgendaOcupadaException extends Exception {

    public AgendaOcupadaException(Trabajo trabajo, Trabajo trab) {
        super("El trabajador tiene la agenda ocupada");
    }

    public AgendaOcupadaException() {

    }
}
