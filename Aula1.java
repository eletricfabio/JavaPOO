package Ex1;
import java.util.Scanner;
public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int setor, salário;
		int result;
		
		do {
			System.out.println("Digite o setor do funcionário (1) Produção e (2) Administrativo: ");
			setor = s.nextInt();

		} while (setor != 1 && setor != 2);
		
		System.out.println("------------------------------------");
		
		if (setor == 1) {
			System.out.println("Produção");
		} else
			if (setor == 2) {
				System.out.println("Administrativo");
				}
		
		System.out.println("------------------------------------");
		
		System.out.println("Digite o salário do colaborador no mês: ");
		salário = s.nextInt();
		

		if (salário < 280) {
			System.out.println("O aumento é de 20%:");
		} else
			if (salário >= 280 && salário < 700) {
				System.out.println("O aumento é de 15%:");
			} else
				if (salário >= 700 && salário < 1500) {
					System.out.println("O aumento é de 10%:");
				} else
					if (salário >= 1500) {
						System.out.println("O aumento é de 5%:");
		}
	}
}
