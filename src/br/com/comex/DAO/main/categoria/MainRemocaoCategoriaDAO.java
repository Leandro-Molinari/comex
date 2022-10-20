package br.com.comex.DAO.main.categoria;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoCategoriaDAO {

	public static void main(String[] args) throws SQLException {

		try(Connection connection= new ConnectionFactory().recuperaConexao()){
		     CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		     Categoria categoria = categoriaDAO.PegaIdCategoria(20);
		     categoriaDAO.excluiCategoria(categoria);
		}			
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
}