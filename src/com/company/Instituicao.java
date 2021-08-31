package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Instituicao {

    private List<Cliente> clientesComPendencia = new ArrayList<Cliente>();

    public void addClientePendente(Cliente cliente){
        this.clientesComPendencia.add(cliente);
    }

    public Boolean verificarClienteComPendencia(Cliente cliente){
        return clientesComPendencia.contains(cliente);
    };


}
