package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TotalProdutosVendidos {
		
		private static int soma;
	

		public List<PedidoCsv> SomeTotalProdutosCsv() throws FileNotFoundException{
			
			List<PedidoCsv> TotalProdutosCsv = new ArrayList<PedidoCsv>();
			
			InputStream inputStream = new FileInputStream("pedidos.csv");
			Scanner scanner = new Scanner(inputStream);
			
			scanner.nextLine();
			int soma = 0;
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				String[] valores = linha.split(",");
				String quantidade = valores[3];
				int valor = Integer.parseInt(quantidade);
				soma = soma + valor;
				
			}
			scanner.close();
			TotalProdutosVendidos.soma = soma;
			return TotalProdutosCsv;
		}

		public static int getSoma() {
			return soma;
		}
	}
		

