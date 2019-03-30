package AulaLab2;

import java.util.Scanner;

public class ProdutoP1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite código do produto:");
		int id = s.nextInt();
		
		System.out.println("Digite o nome do produto:");
		String nome = s.nextLine();
		
		System.out.println("Digite o valor:");
		float valor = s.nextFloat();
		
		
		Produto p1 = new Produto(id, nome, valor);
		
		p1.Alterar("Coka Cola");
		
		System.out.println("Produto: " + p1.id + ", " + p1.nome + ", " + p1.valor);

	}

}