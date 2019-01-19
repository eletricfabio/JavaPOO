package Ex6_Animal;

public class Animal {
	private String nome;
	private int coordenadaX;
	private int coordenadaY;
	
	public Animal (String nome) {
		this.nome = nome;
	}
	
	public Animal() {
		this.nome = "anonimo";
	}

	public String getNome() {
		return nome;
	}
	
	protected void setCoordenadas(int x, int y) {
	coordenadaX = x;
	coordenadaY = y;
	
	}
	
	protected int getCoordenadasX() {
		return coordenadaX;
	}
	
	protected int getCoordenadasY() {
		return coordenadaY;
	}
	
	public void mover (int x, int y) {
		System.out.println("Não sei me mover");
	}
}
