public class ExecutaClassePessoa {
	public static void main(String[] args) {
		pessoa minhaEmpresa = new pessoa();
		minhaEmpresa.setnome("Fábio");
		minhaEmpresa.setidade(35);
		minhaEmpresa.setprofissao("Eletrotécnico");
		minhaEmpresa.setsalario(5000.00);
		
		minhaEmpresa.imprimir();
	}
}