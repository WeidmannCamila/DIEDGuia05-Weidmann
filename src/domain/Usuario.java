package domain;

import exceptions.AlquilerNoEntregadoException;

import java.util.List;

public class Usuario {
    private String correo;
    private List<Contratable> contratados;

    public void Contratar (Contratable c) throws AlquilerNoEntregadoException {
        if(contratados.size()>=2)
            throw new AlquilerNoEntregadoException();
        else
            this.contratados.add(c);
    }
}
