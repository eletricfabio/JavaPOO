package Ex1;

import java.util.Scanner;

public class Aula3 {
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Digite o valor incial: ");
		double valorInicial = n.nextDouble();
		Conta caixa = new Conta(valorInicial); // instância de classe = "OBJETO"
		while(true) {
			System.out.print("Quanto deseja sacar: ");
			double valorSacar = n.nextDouble();
			if(caixa.saca(valorSacar)) {
				System.out.print("Consegui sacar!!!");
				System.out.println("Saldo atual: " + caixa.getSaldo()+"\n");
			} else {
				System.out.print("No momento nao pode sacar!");
				System.out.println("Saldo atual: " + caixa.getSaldo()+"\n");
			}
		}
	}
	
}

class Conta {
	int conta;
	String cliente;
	double saldo;
	double limite;
	
	public Conta(double valorInicial) {
		saldo = valorInicial;
	}

	boolean saca(double valor) {
		if (this.saldo < valor)
			return false;
		else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
		
	}
	
	double getSaldo() {
		return this.saldo;
	}
}