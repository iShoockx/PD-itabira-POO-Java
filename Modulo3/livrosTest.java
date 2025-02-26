package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;



import com.mycompany.app.Model.Livro;

import com.mycompany.app.Model.Autor;



public class livrosTest {
    @Test
    public void testGetTitulo(){
        
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setTitulo("Java Basico");

    assertEquals("Java Basico", livros[0].getTitulo());

    livros[1].setTitulo("Java Avançado");
    
    assertEquals("Java Avançado", livros[1].getTitulo());
    }

    @Test
    public void testSetTitulo(){
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setTitulo("Java Basico");

    assertEquals("Java Basico", livros[0].getTitulo());

    livros[1].setTitulo("Java Avançado");
    
    assertEquals("Java Avançado", livros[1].getTitulo());
    }

    @Test
    public void testGetAutor(){
    
    Autor autor = new Autor ("Jess","Brasileira");        
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setAutor(autor);

    assertEquals(autor, livros[0].getAutor());

    livros[1].setAutor(autor);
    
    assertEquals(autor, livros[1].getAutor());
    }

    @Test
    public void testSetAutor(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setAutor(autor);

    assertEquals(autor, livros[0].getAutor());

    livros[1].setAutor(autor);
    
    assertEquals(autor, livros[1].getAutor());
    }

    @Test
    public void testGetGenero(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setGenero("tecnologia");

    assertEquals("tecnologia", livros[0].getGenero());

    livros[1].setGenero("tecnologia");
    
    assertEquals("tecnologia", livros[1].getGenero());
    }

    @Test
    public void testSetGenero(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setGenero("tecnologia");

    assertEquals("tecnologia", livros[0].getGenero());

    livros[1].setGenero("tecnologia");
    
    assertEquals("tecnologia", livros[1].getGenero());
    }

    @Test
    public void testIsDisponivel(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setDisponivel(true);

    assertEquals(true, livros[0].isDisponivel());

    livros[1].setDisponivel(false);
    
    assertEquals(false, livros[1].isDisponivel());
    }

    @Test
    public void testSetDisponivel(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setDisponivel(true);

    assertEquals(true, livros[0].isDisponivel());

    livros[1].setDisponivel(false);
    
    assertEquals(false, livros[1].isDisponivel());
    }
}
    
    

    
