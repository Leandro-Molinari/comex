package br.com.comex.DAO.main.pedido;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.ProdutoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainListagemProdutoDao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexao();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		
		produtoDAO.listaProduto();
		
	}
	
}
