package Ex6_Animal;

public class Peixe extends Animal {
	public Peixe(String nome) {
		super(nome);
	}
	
	@Override
	public void mover(int x, int y) {
		setCoordenadas(x, y);
		System.out.println("Movimento do Peixe");
	}
	
	public void nadar() {
		System.out.println("Nadar");
	}
}