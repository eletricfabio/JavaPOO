package Ex5;

public class Salario {
	public int salario(int valor) {
		System.out.println("Sal�rio com argumento de inteiro de: " + valor);
		return valor*12;
	}
	
	public double salario(double valor) {
		System.out.println("Sal�rio com argumento de double de: " + valor);
		return valor*12;
	}
}