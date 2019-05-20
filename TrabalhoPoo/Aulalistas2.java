package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Aulalistas2 {

	public static void main(String[] args) {
		// Exemplo de listas		
		
		List<Integer> listaInteiros = new ArrayList<>();
		listaInteiros.add(10000); //*add métodos prontos
		listaInteiros.add(1000);
		listaInteiros.add(100);
		listaInteiros.add(10);
		listaInteiros.add(1);
		
		for (Integer num : listaInteiros) { // *foreach (varrer uma lista)
			System.out.println(num);
		}

	}

}