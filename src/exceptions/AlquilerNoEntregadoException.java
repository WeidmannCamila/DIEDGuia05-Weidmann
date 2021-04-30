package exceptions;

public class AlquilerNoEntregadoException extends Exception {

    public AlquilerNoEntregadoException() {
        super("No puede alquilar");
    }
}
