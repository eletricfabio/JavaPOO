public class ExecutaClasseConta {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.setDono("F�bio");
		minhaConta.setSaldo(1000.00);
		
		minhaConta.saca(2000.00);
	}
}