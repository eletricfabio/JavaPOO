package AulaLab2;

public class Venda {
	int id;
	Produto prod;
	int quant;
	
	public float calcular() {
		float result=0f;
		result = (prod.valor * quant);
		return result;
	}
}