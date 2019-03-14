package AulaListas;

import java.util.ArrayList;
import java.util.List;

public class listasBandas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listaBandas = new ArrayList<>();
		listaBandas.add("Banda Novo Som"); //*add métodos prontos
		listaBandas.add("Banda Discoprase");
		listaBandas.add("Banda Shalom");
		
		for (String a : listaBandas) { // *foreach (varrer uma lista)
			System.out.println(a);
		}
			System.out.println("Elemento do índice 1: "+listaBandas.get(1));
		
			listaBandas.remove(1);
			listaBandas.add("Banda Shalom");
	
			System.out.println("Banda Discoprase removida e Banda Shalom adicionada: ");
		
			for (String b : listaBandas) { // *foreach (varrer uma lista)
				System.out.println(b);
			}
			
			System.out.println("Quantidade de elementos: ");
			System.out.println(listaBandas.size());
			
			listaBandas.clear();
			
			for (String b : listaBandas) { // *foreach (varrer uma lista)
				System.out.println(b);
			}
	}
}