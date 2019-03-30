package AulaLab2;

public class Produto {
	int id;
	String nome;
	float valor;
	
	Produto(int _id, String _nome, float _valor) {
		id = _id;
		nome = _nome;
		valor = _valor;
	}
	
	public void Alterar (String novonome) {
		nome = novonome;
	}
	
	public void Alterar (int novoid) {
		id = novoid;
	}
	
	public void Alterar (float novovalor) {
		valor = novovalor;
	}

}