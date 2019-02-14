package Aula2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Ler Nome, Idade, Período de 10 alunos e depois imprimir
		
		Scanner s = new Scanner(System.in);
		
		String nome[] = new String [3];
		
		int[] idade = new int [3];
		
		float[] periodo = new float [3];
		
		for (int cont=0; cont<3; cont++) {
			
			System.out.println("O nome do aluno: ");
			nome[cont]=(String) s.next();
			System.out.println("A idade do aluno: ");
			idade[cont]= s.nextInt();
			System.out.println("O perído do aluno: ");
			periodo[cont]= s.nextFloat();

		}
		
		System.out.println("");
		System.out.println("=====================");	
		System.out.println("REGISTRO DE ALUNOS");
		System.out.println("=====================");
		System.out.println("");
		
		for (int cont=0; cont<3; cont++) {

			System.out.println("Nome: " + nome[cont]);
			System.out.println("Idade: " + idade[cont]);
			System.out.println("Período: " + periodo[cont]);
		    System.out.println("=====================");
		    

		}
		
		    System.out.println("=====================");
		
	}
}