package comex;

public class MainProduto {
	
		//MainCategoria categoria();
	
	public static void main(String[] args) {

		Categoria categoria1 = new Categoria();
		categoria1.contador();
		categoria1.setNome("Informática");
		categoria1.setStatus(StatusCategoria.ATIVA);

		
		Categoria categoria2 = new Categoria();
		categoria2.contador();
		categoria2.setNome("Móveis");
		categoria2.setStatus(StatusCategoria.INATIVA);
		
		
		Categoria categoria3 = new Categoria();
		categoria3.contador();
		categoria3.setNome("Livros");
		categoria3.setStatus(StatusCategoria.ATIVA);
		
			
		Produto produto1 = new Produto();
		produto1.contador();
		produto1.setNome("Notebook Samsung");
		produto1.setDescricao("Tela de 14'', SSD 250 GB, 16GB RAM");
		produto1.setPrecoUnitario(3523.0);
		produto1.setQuantidadeEmEstoque(1);
		produto1.setCategoria(categoria1);
				
		
		ProdutoIsento produto2 = new ProdutoIsento();
		produto2.contador();
		produto2.setNome("Clean Architecture");
		produto2.setDescricao("Autor:Robert Martin, 432 páginas, Ed. Alta Books");
		produto2.setPrecoUnitario(102.90);
		produto2.setQuantidadeEmEstoque(2);
		produto2.setCategoria(categoria3);

		Produto produto3 = new Produto();
		produto3.contador();
		produto3.setNome("Monitor Dell 27''");
		produto3.setDescricao("Ultra HD, 16:9, 2 HDMI 2.0, Bivolt");
		produto3.setPrecoUnitario(1889.00);
		produto3.setQuantidadeEmEstoque(3);
		produto3.setCategoria(categoria1);
		
		    //                             "Clean Architecture"    Autor:Robert Martin, 432 páginas, Ed. Alta Books       3523.0     "Informática"
		System.out.println("    |     Código     |         Produto         |                           Descrição                   "
									+ "            |   Valor    | Imposto Unitário | Quantidade | Valor Total |   Categoria  |");
		
		System.out.println("    |        " + produto1.getId() + "          | " + produto1.getNome() + " |          " 
				+ produto1.getDescricao() + "            |  " + produto1.getPrecoUnitario() + "  |         " + produto1.imposto(0) + "       |        "
				+ produto1.getQuantidadeEmEstoque() + "        |    " + produto1.totalEstoque(0) +"    | "+ produto1.getCategoria().getNome() + " |");

		System.out.println("    |        " + produto2.getId() + "          | " + produto2.getNome() + "  | " 
				+ produto2.getDescricao() + "  |    " + produto2.getPrecoUnitario() + "  |              " + produto2.imposto(0) + "       |        "
				+ produto2.getQuantidadeEmEstoque() + "        |      " + produto2.totalEstoque(0) +"    |     " + produto2.getCategoria().getNome() + "     | " );
		
		System.out.println("    |        " + produto3.getId() + "          |   " + produto3.getNome() + "   |            " 
				+ produto3.getDescricao() + "            |  " + produto3.getPrecoUnitario() + "  |           " + produto3.imposto(0) + "       |        "+ 
				+ produto3.getQuantidadeEmEstoque() + "        |    " + produto3.totalEstoque(0) + "    | " + produto3.getCategoria().getNome() + " |");
	
	
	}

	
	
}
