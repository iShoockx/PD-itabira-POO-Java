package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


import com.mycompany.app.Model.Autor;

public class AutorTest {

    @Test 
    public void testGetNacionalidade() {
        Autor autor = new Autor("Jess","Brasileira");

        autor.setNacionalidade("Brasileira");

        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test 
    public void testSetNacionalidade() {
        Autor autor = new Autor("Jess","Brasileira");

        autor.setNacionalidade("Brasileira");

        assertEquals("Brasileira", autor.getNacionalidade());
    }
}