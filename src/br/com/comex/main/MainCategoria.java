package br.com.comex.main;

import br.com.comex.enums.StatusCategoria;
import br.com.comex.modelo.Categoria;

public class MainCategoria {

	public static void main(String[] args) {

			Categoria categoria1 = new Categoria("Informática", StatusCategoria.ATIVA);
	     			
			Categoria categoria2 = new Categoria("Móveis", StatusCategoria.INATIVA);
					
			Categoria categoria3 = new Categoria("Livros", StatusCategoria.ATIVA);
					
			System.out.println("Categoria " + categoria1.getNome() + " (" 
					+ categoria1.getId() + " - " + categoria1.getStatus() + ")");
			System.out.println("Categoria " + categoria2.getNome() + " (" 
										+ categoria2.getId() + " - " + categoria2.getStatus() + ")");
			
			System.out.println("Categoria " + categoria3.getNome() + " (" 
										+ categoria3.getId() + " - " + categoria3.getStatus() + ")");
			
	
	}

}
