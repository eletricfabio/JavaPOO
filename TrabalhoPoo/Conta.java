package TrabalhoPoo;

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
			double novoSaldo = this.getSaldo() - valor;
			this.setSaldo (novoSaldo);
			System.out.println("\n========================================");
			System.out.println("      Seu saldo atual é: " + "R$ " + df.format (novoSaldo));
			System.out.println("========================================");
			return true;
		}
		
	}
		boolean Deposito(double valor) {
			if (this.getSaldo() == valor) {
				System.out.println("\n====================================");
				System.out.println(" Depósito realizado com sucesso!");
				System.out.println(" Seu saldo de Depósito é: " + "R$ " + df.format (saldo));
				System.out.println("====================================");
				return false;
			}
			else {
				double novoSaldo = this.getSaldo() + valor;
				this.setSaldo (novoSaldo);
				System.out.println("========================================");
				System.out.println("    Depósito não realizado!");
				System.out.println("   Seu saldo continua: " + "R$ " + df.format (novoSaldo));
				System.out.println("========================================");
				return true;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimir() {
		System.out.println("\n Cliente: " + getDono());
		System.out.println("\n Saldo disponível: " + df.format (getSaldo()));
		
	}
	
}