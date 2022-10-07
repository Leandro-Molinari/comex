package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.TotalCategorias;
import br.com.comex.csv.TotalProdutosVendidos;

public class MainTodosOsEssenciaisCsv {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> dadosPedidoCsv = leitorPedidosCsv.leiaDadosPedidoCsv();
		TotalProdutosVendidos someTotalProdutosCsv = new TotalProdutosVendidos();
		someTotalProdutosCsv.SomeTotalProdutosCsv();
		TotalCategorias totalCategorias = new TotalCategorias();
		int total = totalCategorias.totalizarCategorias(dadosPedidoCsv);
		System.out.println("Total de Pedidos: " + dadosPedidoCsv.size());
		System.out.println("Total de Produtos Vendidos: " + TotalProdutosVendidos.getSoma());
		System.out.println("Total de Categorias: " + total);
	}

}
