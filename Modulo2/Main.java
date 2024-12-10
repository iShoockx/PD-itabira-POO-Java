public class Main {
	public static void main (String [] args) {
		Livro livro = new Livro();
		livro.setDisponivel(false);
		livro.setTitulo("Java for Beginners");
		livro.setGenero("Tecnologia");
		livro.imprimirinformaçoeslivro();

		Usuario usuario = new Usuario();
		usuario.setNome("Lucas Rafael");
		usuario.setIdade(25);
		usuario.imprimirinformaçoesusuario();
		
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setRetirada("Wed May 08 23:37:21 BRT 2024");
		emprestimo.setDevoluçao("Wed May 08 23:37:21 BRT 2024");
		emprestimo.imprimirinformaçoesemprestimo();

	}
}