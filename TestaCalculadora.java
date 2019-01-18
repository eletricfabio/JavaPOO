package Ex4;

public class TestaCalculadora {

	public static void main(String[] args) {
		System.out.println("Resultado é: " + Calculadora.resultado(10, 50));
	
	
	Calculadora number = new Calculadora();
		System.out.println("Resultado da soma: " + number.soma(5, 10));
		
		System.out.println("Resultado da multiplicacao: " + number.multiplicacao(5, 10));
		
		System.out.println("Resultado da divisao com 2 parâmetros: " + number.divisao(2, 2));
		
		System.out.println("Resultado da divisao com 1 parâmetro: " + number.divisao(2));
	}
}