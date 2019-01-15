package Ex1;

public class Aula2 {

		// Poo				
		private String cor;
		private boolean saberEscrever;
		
		public Aula2 (String c, boolean se) {
			cor = c;
			saberEscrever = se;
		}
		
		public void entrar () {
			System.out.println("Estou quase lá!");
		}
		public void sair () {
			System.out.println("Estou aprendendo POO");
		}
		public void escrever () {
		if (saberEscrever) 
			System.out.println("Acho que consegui :) kkkkk!"); }
}