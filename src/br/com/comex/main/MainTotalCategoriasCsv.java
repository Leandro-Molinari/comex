package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.TotalCategorias;

public class MainTotalCategoriasCsv {

	public static void main(String[] args) throws FileNotFoundException {

		LeitorPedidosCsv leitor = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos = leitor.leiaDadosPedidoCsv();
		
		TotalCategorias totalCategorias = new TotalCategorias();
		int total = totalCategorias.totalizarCategorias(pedidos);
		System.out.println("Total de Categorias: " + total);
	}

}
