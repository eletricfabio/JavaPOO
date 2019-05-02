package TrabalhoPoo;

import java.util.Scanner;

public class ExecutaConta {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor de deposito: " + "R$");
		double deposito = s.nextDouble();
		
		
		Conta minhaConta = new Conta();
		minhaConta.setDono("Fábio Vieira dos Santos");
		minhaConta.setSaldo(deposito);
		
		minhaConta.Deposito(deposito);
		
		System.out.println("\nDigite um valor de saque: " + "R$");
		double sacar = s.nextDouble();
		
		minhaConta.saca(sacar);
		
		minhaConta.imprimir();
		
	}
}