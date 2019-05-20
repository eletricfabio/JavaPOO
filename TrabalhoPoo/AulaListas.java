package Ex1;

import java.util.ArrayList;
import java.util.List;
public class AulaListas {
	

	public static void main(String[] args) {


				List<String> listaBandas = new ArrayList<>();
				listaBandas.add("Banda Novo Som"); //*add métodos prontos
				listaBandas.add("Banda Discoprase");
				listaBandas.add("Banda Shalom");
				
				for (String a : listaBandas) { // *foreach (varrer uma lista)
					System.out.println(a);
				}
					System.out.println("\nElemento do índice 1: " + listaBandas.get(1));
				
					listaBandas.remove(1);
					listaBandas.add("Banda Shalom");
			
					System.out.println("\nBanda Discoprase removida e Banda Shalom adicionada: ");
				
					for (String b : listaBandas) { // *foreach (varrer uma lista)
						System.out.println(b);
					}
					
					System.out.println("\nQuantidade de elementos: ");
					System.out.println(listaBandas.size());
					
					listaBandas.clear();
					
					for (String b : listaBandas) { // *foreach (varrer uma lista)
						System.out.println(b);
					}
			}
		}