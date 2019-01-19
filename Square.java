package Ex6_Square;

import Ex6_Xadrez.Peao;
import Ex6_Xadrez.Peca;

public class Square {
	public static int square (int a) {
		System.out.println("Square of int: " + a);
		return a * a;
	}
	
	public static double square (double a) {
		System.out.println("Square of double: " + a);
		return a * a;
	}
	
	public static void main(String[] args) {
		square(1);
		square(1.0);
	}
}