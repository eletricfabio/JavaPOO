package Ex6_Animal;

public class Anfibio extends Animal {
	public Anfibio(String nome) {
		super(nome);
	}
	
	@Override
	public void mover(int x, int y) {
		setCoordenadas(x, y);
		System.out.println("Movimento do Anfíbio");
	}
}