package com.company.tests;

import com.company.Banco;
import com.company.Cliente;
import com.company.Serasa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void deveRetornarSemPendencia(){
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.comprar());
    }

    @Test
    void deveRetornarNomeSujoSerasa(){
        Cliente cliente = new Cliente();
        Serasa.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.comprar());
    }

    @Test
    void deveRetornarSemSaldoBanco(){
        Cliente cliente = new Cliente();
        Banco.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.comprar());
    }

}
