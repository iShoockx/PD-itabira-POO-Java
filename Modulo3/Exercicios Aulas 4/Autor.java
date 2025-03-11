package com.mycompany.app.Model;

public class Autor extends Pessoa {
	private String nacionalidade;
	private String tipo;
	
	// Construtor com nome e nacionalidade
	public 	Autor(String nome,String nacionalidade, String tipo){
		super(nome); // Chama o contrutor da classe Pessoa
		this.nacionalidade = nacionalidade;
		this.tipo = tipo;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}
	
	public String getTipo() {
        return tipo;
    }
}
	

