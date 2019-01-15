public class Conta {
	private int numero;
	private String dono;
	private double saldo;
	private double limite;

	boolean saca(double valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Não posso mudar para esse saldo, seu saldo continua: " + saldo);
			return false;
		}
		else {
			double novoSaldo = this.getSaldo() - valor;
			this.setSaldo (novoSaldo);
			System.out.println("Seu saldo atual é: " + novoSaldo);
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

	public double getNumero() {
		return numero;
	}
}