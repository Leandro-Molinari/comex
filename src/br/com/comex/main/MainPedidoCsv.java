package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;

public class MainPedidoCsv {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> dadosPedidoCsv = leitorPedidosCsv.leiaDadosPedidoCsv();
		System.out.println("Total de Pedidos: " + dadosPedidoCsv.size());
	}
}
