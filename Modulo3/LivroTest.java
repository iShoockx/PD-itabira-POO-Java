package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Target;

import com.mycompany.app.model.Livro;
import com.mycompany.app.model.Pessoa;
import com.mycompany.app.model.Autor;



public class LivroTest {
    @Test
    public void testGetTitulo(){
        
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setTitulo("Java Basico");

    assertEquals("Java Basico", livro[0].getTitulo());

    livros[1].setTitulo("Java Avançado");
    
    assertEquals("Java Avançado", livro[1].getTitulo());
    }

    @Test
    public void testSetTitulo(){
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setTitulo("Java Basico");

    assertEquals("Java Basico", livro[0].getTitulo());

    livros[1].setTitulo("Java Avançado");
    
    assertEquals("Java Avançado", livro[1].getTitulo());
    }

    @Test
    public void testGetAutor(){
    
    Autor autor = new Autor ("Jess","Brasileira");        
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setAutor(autor);

    assertEquals(autor, livro[0].getAutor());

    livros[1].setAutor(autor);
    
    assertEquals(autor, livro[1].getAutor());
    }

    @Test
    public void testSetAutor(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setAutor(autor);

    assertEquals(autor, livro[0].getAutor());

    livros[1].setAutor(autor);
    
    assertEquals(autor, livro[1].getAutor());
    }

    @Test
    public void testGetGenero(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setgenero("tecnologia");

    assertEquals(autor, livro[0].getGenero());

    livros[1].setgenero("tecnologia");
    
    assertEquals(autor, livro[1].getGenero());
    }

    @Test
    public void testSetGenero(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livros[0].setgenero("tecnologia");

    assertEquals(autor, livro[0].getGenero());

    livros[1].setgenero("tecnologia");
    
    assertEquals(autor, livro[1].getGenero());
    }

    @Test
    public void testIsDisponivel(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livro[0].setDisponivel(true);

    assertEquals(true, livro[0].isDisponivel());

    livro[1].setDisponivel(false);
    
    assertEquals(false, livro[1].isDisponivel());
    }

    @Test
    public void testSetDisponivel(){
    
    Autor autor = new Autor ("Jess","Brasileira");
    Livro[] livros = new Livro[2];
    livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
    livros[1] = new Livro("Java Avançado", autor,"tecnologia", false);

   
    livro[0].setDisponivel(true);

    assertEquals(true, livro[0].isDisponivel());

    livro[1].setDisponivel(false);
    
    assertEquals(false, livro[1].isDisponivel());
    }
}
    
    
