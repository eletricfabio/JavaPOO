public class pessoa {
	private int idade;
	private String nome; 
	private String profissao;
	private double salario;
	
public int getidade() {
	return idade;
}
public void setidade(int idade) {
	this.idade = idade;
}

public double getsalario() {
	return salario;
}

public void setsalario(double salario) {
	this.salario = salario;
}
public String getprofissao() {
	return profissao;
}
public void setprofissao(String profissao) {
	this.profissao = profissao;
}
public String getnome() {
	return nome;
}
public void setnome(String nome) {
	this.nome = nome;
}

public void imprimir() {
	System.out.println("\n O nome é: " + getnome());
	System.out.println("\n O idade é: " + getidade());
	System.out.println("\n O profissão é: " + getprofissao());
	System.out.println("\n O salário é: " + getsalario());
}
}

