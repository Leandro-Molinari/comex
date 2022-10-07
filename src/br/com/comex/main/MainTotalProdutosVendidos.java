package br.com.comex.main;


import java.io.FileNotFoundException;

import br.com.comex.csv.TotalProdutosVendidos;

public class MainTotalProdutosVendidos {

	public static void main(String[] args) throws FileNotFoundException {
		TotalProdutosVendidos someTotalProdutosCsv = new TotalProdutosVendidos();
		someTotalProdutosCsv.SomeTotalProdutosCsv();
		System.out.print("Total de Produtos Vendidos: " + TotalProdutosVendidos.getSoma());	
	}

}
