package TrabalhoPoo;

public class Cliente {
	
	private String cpf;
	private String cnpj;
	private String nome;
	private int idade;
	
	public Cliente(String cpf,String nome,int idade) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
	return cpf;
	}
	
	public void setCpf(String cpf) {
	this.cpf = cpf;
	
	}
	
	public String getCnpj() {
		return cnpj;
		}
		
		public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
		
		}
	
	public String getNome() {
	return nome;
	}
	
	public void setNome(String nome) {
	this.nome = nome;
	
	}
	
	public int getIdade() {
	return idade;
	}
	
	public void setInt(int idade) {
	this.idade = idade;
	}


}