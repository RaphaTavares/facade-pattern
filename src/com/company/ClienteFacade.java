package com.company;

public class ClienteFacade {

    public static Boolean verificarDisponibilidade(Cliente cliente)
    {
        if(Banco.getInstancia().verificarClienteComPendencia(cliente)){
            return false;
        }
        if(Serasa.getInstancia().verificarClienteComPendencia(cliente)){
            return false;
        }
        return true;
    }
}
