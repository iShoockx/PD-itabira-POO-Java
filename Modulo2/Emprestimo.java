public class Emprestimo {
	private String retirada;
	private String devoluçao;
	
	
	
	public String getRetirada() {
		return this.retirada;
	}
	
	public void setRetirada(String retirada){
		this.retirada = retirada;
	}
	
	public String getDevoluçao() {
		return this.devoluçao;
	}
	
	public void setDevoluçao(String devoluçao){
		this.devoluçao = devoluçao;
	}
	
	
	public void imprimirinformaçoesemprestimo() {
		
		System.out.println("Data de Retirada: " + getRetirada());
		System.out.println("Data de Devoluçao: " + getDevoluçao());
	}
}
