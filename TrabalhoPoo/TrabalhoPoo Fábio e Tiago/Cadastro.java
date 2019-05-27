package TrabalhoPoo;

public class Cadastro extends Cliente{
	private int pf;
	private int pj;
	
	public Cadastro(String cpf, String cnpj, String nome, int idade, int pf, int pj) {
		super(cpf, cnpj, idade);
		this.pf = pf;
		this.pj = pj;
	}
	
	public int getpf() {
	return pf;
	}
	
	public void setpf(int pf) {
	this.pf = pf;
	
	}
	
	public int getpj() {
		return pj;
		}
		
		public void setpj(int pj) {
		this.pj = pj;
		
		}
		
		public void imprimir() {
			System.out.println("\nCPF: " + getCpf());
			System.out.println("\nNome: " + getNome());
			System.out.println("\nIdade: " + getIdade());
		}
}