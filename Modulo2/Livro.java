public class Livro {
	private String titulo;
	private String genero;
	private boolean disponivel;
	
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	
	public boolean getDisponivel() {
        	return disponivel;
    	}

    
    	public void setDisponivel(boolean disponivel) {
        	this.disponivel = disponivel;
    	}
	
	public void validarDisponibilidade(){
		if (getDisponivel() == true) {
			System.out.println("O livro esta disponível para emprestimo");
		}else {
			System.out.println("O livro não esta disponível");
		}
	}
		
		
	

	public void imprimirinformaçoeslivro() {
		validarDisponibilidade();
		System.out.println("Livro: " + getTitulo());
		Autor autor = new Autor();
		autor.setNome("Jessica Felix");
		System.out.println("Autor: " + autor.getNome());
		System.out.println("Genero: " + getGenero());
	}
}
