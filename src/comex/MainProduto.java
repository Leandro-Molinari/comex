package comex;

public class MainProduto {
	
public static void main(String[] args) {

	
	Categoria categoria1 = new Categoria("Informática", StatusCategoria.ATIVA);
		
	Categoria categoria2 = new Categoria("Móveis", StatusCategoria.INATIVA);
			
	Categoria categoria3 = new Categoria("Livros", StatusCategoria.ATIVA);
	
		
	Produto produto1 = new Produto("Notebook Samsung", "Tela de 14'', SSD 250 GB, 16GB RAM", 3523.0, 1, categoria1);
	ProdutoIsento produto2 = new ProdutoIsento("Clean Architecture", "Autor:Robert Martin, 432 páginas, Ed. Alta Books", 102.90, 2, categoria2);
	Produto produto3 = new Produto("Monitor Dell 27''", "Ultra HD, 16:9, 2 HDMI 2.0, Bivolt", 1889.00, 3, categoria1);
	
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
