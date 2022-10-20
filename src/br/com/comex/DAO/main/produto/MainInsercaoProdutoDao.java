package br.com.comex.DAO.main.produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Produto.Tipo;

public class MainInsercaoProdutoDao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexao();
		ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		Produto produto = new Produto(0);
		produto.setNome("Forno Microondas Electrolux");
		produto.setDescricao("35 litros, autolimpante"); 
		produto.setPreco_Unitario(485.28);	
		produto.setQuantidade_Estoque(5);
		produto.setCategoria_id(13);
		produto.setTipo(Tipo.ISENTO);
		produtoDAO.insereProduto(produto);
		
	}
	
}