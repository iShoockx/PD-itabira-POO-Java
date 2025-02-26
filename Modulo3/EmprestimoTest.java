package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Target;
import java.util.Date;

public class EmprestimoTest {
    @Test
    public void testGetRetirada(){
        
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        emprestimo.setRetirada(new Date());

        assertEquals(new Date(), emprestimo.getRetirada());
    
    }
    
    @Test
    public void testSetRetirada(){
        
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        emprestimo.setRetirada(new Date());

        assertEquals(new Date(), emprestimo.getRetirada());
    
    }

    @Test
    public void testGetDevoluçao(){
        
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        emprestimo.setDevoluçao(new Date());

        assertEquals(new Date(), emprestimo.getDevoluçao());
    
    }

    @Test
    public void testSetDevoluçao(){
        
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        emprestimo.setDevoluçao(new Date());

        assertEquals(new Date(), emprestimo.getDevoluçao());
    
    }
}
