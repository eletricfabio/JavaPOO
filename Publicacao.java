package Ex3;

public class Publicacao {
	private String nome;
	private String dataPublicacao;
	private String editora;

	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getdataPublicacao() {
		return dataPublicacao;
	}
	public void setdataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String geteditora() {
	return editora;
	}
	public void seteditora(String editora) {
		this.editora = editora;
	}

	public void imprimir() {
		System.out.println("\n Publicação Especial: " + getnome());
		System.out.println("\n A data da Publicação é: " + getdataPublicacao());
		System.out.println("\n A Editora do livro é: " + geteditora());
	}
}
