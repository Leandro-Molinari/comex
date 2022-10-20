package br.com.comex.DAO.main.categoria;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainListagemCategoriaDao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexao();
		
		CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		
		categoriaDAO.listaCategoria();
		
	}
	
}