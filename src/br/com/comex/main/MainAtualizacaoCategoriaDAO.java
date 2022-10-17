package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoCategoriaDAO {

	public static void main(String[] args) throws SQLException {

		try(Connection connection= new ConnectionFactory().recuperaConexao()){
		     CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		     Categoria categoria = categoriaDAO.PegaIdCategoria(8);
		     categoria.setNome("TECNOLOGIA");
		     categoriaDAO.alteraCategoria(categoria);
		}
			
					
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
		
		

}
