package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Aulalistas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listaFilme = new ArrayList<>();
		listaFilme.add("Fogo & Sangue � Vol. 1"); //*add m�todos prontos
		listaFilme.add("2018");
		listaFilme.add("Martin,George R. R. - Suma De Letras");
		listaFilme.add("Livro: Fic��o Cient�fica e Fantasia");

for (String a : listaFilme) { // *foreach (varrer uma lista)
	System.out.println(a);
	
}
	System.out.println("--------------------------------------------");
	System.out.println("\nT�tulo: " + listaFilme.get(0));
	System.out.println("\nAno: "    + listaFilme.get(1));
	System.out.println("\nG�nero: " + listaFilme.get(2));
	System.out.println("\nClasse: " + listaFilme.get(3));
	
		}
}