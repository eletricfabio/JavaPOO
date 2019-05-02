package TrabPoo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExecutaConta {

public static void main(String[] args) {
		
		/*String nome = null;
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");*/
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor de deposito: " + "R$");
		double deposito = s.nextDouble();
		
		
		Conta minhaConta = new Conta();
		minhaConta.setDono("Fábio Vieira dos Santos");
		minhaConta.Deposito(deposito);
		
		
		System.out.println("\nDigite um valor de saque: " + "R$");
		double sacar = s.nextDouble();
		
		minhaConta.saca(sacar);
		
		minhaConta.imprimir();
		
	}
}