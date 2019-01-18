package Ex5;

public class Salario {
	public int salario(int valor) {
		System.out.println("Salário com argumento de inteiro de: " + valor);
		return valor*12;
	}
	
	public double salario(double valor) {
		System.out.println("Salário com argumento de double de: " + valor);
		return valor*12;
	}
}