package com.mycompany.app.Model;

// Classe Artigo que herda de Publicação
public class Artigo extends Publicacao {
    private String genero;
    private boolean publicado;

    public Artigo(String título, Autor autor, String genero, boolean publicado) {
        super(título, autor);
        this.genero = genero;
        this.publicado = publicado;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isPublicado() {
        return publicado;
    }

    @Override
    public void validarPublicação() {
        System.out.println("Validando publicação de Artigo...");
        if (publicado) {
            System.out.println("O livro está disponível.");
        } else {
            System.out.println("O livro não está disponível.");
        }
    }
}
