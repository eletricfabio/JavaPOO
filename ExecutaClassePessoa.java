public class ExecutaClassePessoa {
	public static void main(String[] args) {
		pessoa minhaEmpresa = new pessoa();
		minhaEmpresa.setnome("F�bio");
		minhaEmpresa.setidade(35);
		minhaEmpresa.setprofissao("Eletrot�cnico");
		minhaEmpresa.setsalario(5000.00);
		
		minhaEmpresa.imprimir();
	}
}