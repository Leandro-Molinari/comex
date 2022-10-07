package br.com.comex.csv;

import java.util.ArrayList;
import java.util.List;

public class TotalCategorias {
	
	
		public int totalizarCategorias(List<PedidoCsv> pedidos) {
			List<String> categoriasRepetidas = new ArrayList<>();
			for (PedidoCsv pedidosCsv : pedidos) {
				String categoria = pedidosCsv.getCategoria();
				if(!categoriasRepetidas.contains(categoria)) {
				categoriasRepetidas.add(categoria);
				}
			}
			return categoriasRepetidas.size();
		}
			
				

			}

