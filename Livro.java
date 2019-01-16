package Ex3;

public class Livro extends Publicacao {
	private String ISBN;
		
	public void imprimir() {
		System.out.println("O nome do livro é: " + getnome());
	}
}