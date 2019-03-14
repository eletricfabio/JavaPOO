package AulaListas;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	List<Produto> listaProdutos;
	Cliente clienteVenda;
	
	public Venda(){
		listaProdutos = new ArrayList<>();
	}
	
	public void addVenda(List<Produto> produtos, Cliente cliente) {
		listaProdutos = produtos;
		clienteVenda = cliente;
	}
	
	public void vizualizaVenda() {
		System.out.println(listaProdutos.size());
		System.out.println("Venda do cliente: " + clienteVenda.nomeCliente);
	for (Produto prod : listaProdutos) {
		
		System.out.println("produto - Descrição: " + prod.nomeProduto.toString());
		System.out.println("produto - Valor: " + prod.nomeProduto.toString());
		

		}
	}
}