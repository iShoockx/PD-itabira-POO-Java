package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


import com.mycompany.app.Model.Autor;

public class AutorTest {

    @Test 
    public void testGetNacionalidade() {
        Autor autor = new Autor("Jessica", "Inglesa","Autor Tradicional");

        autor.setNacionalidade("Brasileira");

        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test 
    public void testSetNacionalidade() {
        Autor autor = new Autor("Jessica", "Inglesa","Autor Tradicional");

        autor.setNacionalidade("Brasileira");

        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test 
    public void testGetTipo1() {
        Autor autor = new Autor("Jessica", "Inglesa","Autor Tradicional");

        assertEquals("Autor Tradicional", autor.getTipo());
    }

    @Test 
    public void testGetTipo2() {
        Autor autor = new Autor("Jessica", "Inglesa","Autor Usuario");

        assertEquals("Autor Usuario", autor.getTipo());
    }
}
