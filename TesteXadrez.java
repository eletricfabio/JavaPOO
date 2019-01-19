package Ex6_Xadrez;

public class TesteXadrez {

	public static void main(String[] args) {
		Peca peao = new Peao();
		Peca cavalo = new Cavalo();
		Peca bispo = new Bispo();
		
		peao.mover();
		cavalo.mover();
		bispo.mover();
	}

}