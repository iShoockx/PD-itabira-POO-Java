package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Target;
import com.mycompany.app.model.Autor;

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