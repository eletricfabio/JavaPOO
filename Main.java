package AulaListas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Venda dos produtos POO Produtos + Vendas + Cliente

		Cliente cliente = new Cliente();
		cliente.codCliente = 1;
		cliente.nomeCliente = "Fábio";
		cliente.cpf = "123.456.789-10";
		
		List<Produto> produtos = new ArrayList<>();
		
		Produto prod1 = new Produto();
		prod1.codProduto = 1;
		prod1.nomeProduto = "Roupa";
		
		produtos.add(prod1);
		
		Produto prod2 = new Produto();
		prod2.codProduto = 2;
		prod2.nomeProduto = "Calça";
		
		produtos.add(prod2);
		
		Produto prod3 = new Produto();
		prod3.codProduto = 3;
		prod3.nomeProduto = "Blusa";
		
		produtos.add(prod3);
		
		Venda venda = new Venda();
		venda.addVenda(produtos, cliente);
		venda.vizualizaVenda();
	}

}