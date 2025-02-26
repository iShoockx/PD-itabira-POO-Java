package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.model.Usuario;

import static org.junit.Assert.*;

import java.lang.annotation.Target;

public class UsuarioTest{
    @Test
    public void testGetIdade() {

        Usuario usuario = new Usuario("Gabriel",21);

        usuario.setIdade(21);

        assertEquals(21, usuario.getIdade());
        
    }

    @Test
    public void testSetIdade() {

        Usuario usuario = new Usuario("Gabriel",21);

        usuario.setIdade(21);

        assertEquals(21, usuario.getIdade());
        
    }
}