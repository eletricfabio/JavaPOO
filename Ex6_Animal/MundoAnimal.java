package Ex6_Animal;

public class MundoAnimal {

	public static void main(String[] args) {
		
		Animal reino[];
		reino = new Animal[3];
		
		reino[0] = new Anfibio("Salamandra");
		reino[1] = new Ave("Quero-quero");
		reino[2] = new Peixe("Dourado");
		
		System.out.println("1º laço");
		for (int i = 0; i < 3; i++) {
			reino[i].mover(10, 10);
		}
		
		System.out.println("2º laço");
		for (int i = 0; i < 3; i++) {
			if(reino[i] instanceof Peixe) {
				( (Peixe) reino[i]).nadar();
			}
			else {
				reino[i].mover(10, 10);
				System.out.println("Nome: " + reino[i].getNome());
				System.out.println("Nome: " + reino[i].getCoordenadasX()+","+reino[i].getCoordenadasY());
				System.out.println("\n");
			}
			
		}

	}
}