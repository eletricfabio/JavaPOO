package Ex1;

public class Aula2_1 {

	public static void main(String[] args) {
		// Executar classe
		
		Aula2 sala1 = new Aula2("azul", true);
		Aula2 sala2 = new Aula2("verde", false);
		Aula2 sala3 = new Aula2("amarela", true);

		sala1.entrar();
		sala2.sair();
		sala3.escrever();
	}
}