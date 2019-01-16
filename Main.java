package Ex3;

public class Main {

	public static void main(String[] args) {
		Revista rev = new Revista();
		rev.setnome("Gospel");
		rev.setdataPublicacao("fev/2000");
		rev.seteditora("EDBrasil");
		
		Livro liv = new Livro();
		liv.setnome("Bíblia");
		liv.setdataPublicacao("Dez/2008");
		liv.seteditora("EDBahia");
		
		Publicacao pub = new Publicacao();
		pub.setnome("ADD");
		pub.setdataPublicacao("fev/2010");
		pub.seteditora("EDSergipe");
		
		rev.imprimir();
		liv.imprimir();
		pub.imprimir();
		
	}

}