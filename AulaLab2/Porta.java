package AulaLab2;

public class Porta {
	boolean porta_estado;
	int numero;
	String cor;
	int chave; 
	boolean olho_magico;
	
	Porta (String c, int n) {
		cor = c;
		numero = n;
	}
	
	public void Abrir() {
		porta_estado = true;
		System.out.println("Porta aberta!");
	}
	
	public void Fechar() {
		porta_estado = false;
		System.out.println("Porta Fechada!");
	}
	
	public void Acesso(int novachave) {
		chave = novachave;
		System.out.println("Novo Acesso!");
	
	}
	
	public void Vigia(boolean novoolho_magico) {
		olho_magico = novoolho_magico;
		System.out.println("Pensença!");
	
	}
}