package Ex5;

import Ex4.Calculadora;

public class TestaSalario {

	public static void main(String[] args) {
		
		Salario sal = new Salario();
			System.out.println("É igual a: " + sal.salario(700));
			System.out.println("É igual a: " + sal.salario(750.00));
	}

}