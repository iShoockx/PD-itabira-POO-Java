package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Artigo;

public class ArtigoTest {
    @Test
    public void testGetTitulo(){
        
    Autor autor = new Autor("Jessica", "Inglesa","Autor Tradicional");
    Artigo[] artigo = new Artigo[2];
    artigo[0] = new Artigo("Java Basico", autor, "tecnologia", true);
    artigo[1] = new Artigo("Java Avançado", autor,"tecnologia", false);

    assertEquals("Java Basico", artigo[0].getTitulo());

    assertEquals("Java Avançado", artigo[1].getTitulo());
    }



    @Test
    public void testGetAutor(){
    
    Autor autor = new Autor("Jessica", "Inglesa","Autor Tradicional");        
    Artigo[] artigo = new Artigo[2];
    artigo[0] = new Artigo("Java Basico", autor, "tecnologia", true);
    artigo[1] = new Artigo("Java Avançado", autor,"tecnologia", false);

    assertEquals(autor, artigo[0].getAutor());

    assertEquals(autor, artigo[1].getAutor());
    }

    @Test
    public void testGetGenero(){
    
    Autor autor = new Autor("Jessica", "Inglesa","Autor Tradicional");
    Artigo[] artigo = new Artigo[2];
    artigo[0] = new Artigo("Java Basico", autor, "tecnologia", true);
    artigo[1] = new Artigo("Java Avançado", autor,"tecnologia", false);

    assertEquals("tecnologia", artigo[0].getGenero());

    assertEquals("tecnologia", artigo[1].getGenero());
    }

    @Test
    public void testIsDisponivel(){
    
    Autor autor = new Autor("Jessica", "Inglesa","Autor Tradicional");
    Artigo[] artigo = new Artigo[2];
    artigo[0] = new Artigo("Java Basico", autor, "tecnologia", true);
    artigo[1] = new Artigo("Java Avançado", autor,"tecnologia", false);

    assertEquals(true, artigo[0].isPublicado());

    assertEquals(false, artigo[1].isPublicado());
    }
}
