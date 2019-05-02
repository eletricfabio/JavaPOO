package TrabPoo;

import java.text.DecimalFormat;

public class Conta {

	private String dono;
	private double saldo;
	
	DecimalFormat df = new DecimalFormat("#0.00");

	boolean saca(double valor) {
		if (this.getSaldo() < valor) {
			System.out.println("====================================");
			System.out.println("Saque acima do valor permitido.");
			System.out.println(" O saldo atual disponível: " + "R$ " + df.format (saldo));
			System.out.println("====================================");
			return false;
		}
		else {
			this.saldo = this.getSaldo() - valor;
			System.out.println("\n========================================");
			System.out.println("      Seu saldo atual é: " + "R$ " + df.format (this.saldo));
			System.out.println("========================================");
			return true;
		}
		
	}
		boolean Deposito(double valor) {
			if (valor>0) {
				this.saldo = this.getSaldo() + valor;
				System.out.println("\n====================================");
				System.out.println(" Depósito realizado com sucesso!");
				System.out.println(" Seu saldo de Depósito é: " + "R$ " + df.format (this.saldo));
				System.out.println("====================================");
				return true;
			}
			else {
				System.out.println("========================================");
				System.out.println("    Depósito não realizado!");
				System.out.println("   Seu saldo continua: " + "R$ " + df.format (this.saldo));
				System.out.println("========================================");
				return false;
			}
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
		
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void imprimir() {
		System.out.println("\n Cliente: " + getDono());
		System.out.println("\n Saldo disponível: " + df.format (getSaldo()));
		
	}
	
}
