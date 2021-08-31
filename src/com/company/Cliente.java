package com.company;

public class Cliente {

    public Boolean comprar(){
        return ClienteFacade.verificarDisponibilidade(this);
    }
}
