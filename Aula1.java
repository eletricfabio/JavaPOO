package Ex1;
import java.util.Scanner;
public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int setor, sal�rio;
		int result;
		
		do {
			System.out.println("Digite o setor do funcion�rio (1) Produ��o e (2) Administrativo: ");
			setor = s.nextInt();

		} while (setor != 1 && setor != 2);
		
		System.out.println("------------------------------------");
		
		if (setor == 1) {
			System.out.println("Produ��o");
		} else
			if (setor == 2) {
				System.out.println("Administrativo");
				}
		
		System.out.println("------------------------------------");
		
		System.out.println("Digite o sal�rio do colaborador no m�s: ");
		sal�rio = s.nextInt();
		

		if (sal�rio < 280) {
			System.out.println("O aumento � de 20%:");
		} else
			if (sal�rio >= 280 && sal�rio < 700) {
				System.out.println("O aumento � de 15%:");
			} else
				if (sal�rio >= 700 && sal�rio < 1500) {
					System.out.println("O aumento � de 10%:");
				} else
					if (sal�rio >= 1500) {
						System.out.println("O aumento � de 5%:");
		}
	}
}
