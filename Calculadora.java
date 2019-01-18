package Ex4;

public class Calculadora {
	public static int resultado (int num1, int num2) {
		return(num1+num2);
	}
	
	public int soma(int num1, int num2) {
		return(num1+num2);
	}
	
	public int divisao(int num1, int num2) {
		if(num2 == 0)
		return 0;
		else
		return(num1/num2);
	}
	
	public int divisao(int num2) {
		return(num2/num2);
	}
	
	public int multiplicacao(int num1, int num2) {
		return(num1*num2);
	}
}