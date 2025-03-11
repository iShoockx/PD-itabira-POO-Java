package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.Model.Autor;

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
    public void testGetDevolucao(){
        
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        emprestimo.setDevolucao(new Date());

        assertEquals(new Date(), emprestimo.getDevolucao());
    
    }

    @Test
    public void testSetDevolucao(){
        
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        emprestimo.setDevolucao(new Date());

        assertEquals(new Date(), emprestimo.getDevolucao());
    
    }
}