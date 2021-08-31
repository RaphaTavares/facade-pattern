package com.company;

public class Serasa extends Instituicao{

    private static Serasa serasa = new Serasa();

    private Serasa(){};
    public static Serasa getInstancia(){ return serasa; }

}
