package AulaLab2;

public class PortaP1 {

	public static void main(String[] args) {
		Porta p1 = new Porta("Azul", 3);
		p1.Fechar();
		p1.chave = 12345;
		p1.olho_magico = true;
		
		System.out.println("Numero da porta: " + p1.numero);
		System.out.println("Cor da porta: " + p1.cor);
		System.out.println("Estado: " + p1.porta_estado);
		System.out.println("Acesso: " + p1.chave);
		System.out.println("Vigia: " + p1.olho_magico);
	}

}