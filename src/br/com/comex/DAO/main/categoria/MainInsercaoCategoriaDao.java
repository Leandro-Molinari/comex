package br.com.comex.DAO.main.categoria;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Categoria.StatusCategoria;

public class MainInsercaoCategoriaDao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexao();
		CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		Categoria categoria = new Categoria();
		categoria.setNome("JARDINAGEM");
		categoria.setStatus(StatusCategoria.ATIVA);
		categoriaDAO.insereCategoria(categoria);
		
	}


	
}