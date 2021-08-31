package com.company;

public class Banco extends Instituicao{

    private static Banco banco = new Banco();

    private Banco(){};

    public static Banco getInstancia(){ return banco; }

}
