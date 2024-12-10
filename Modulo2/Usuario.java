public class Usuario extends Pessoa {
	private int idade;
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
		

	public void imprimirinformaçoesusuario() {
		
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
	}
}
