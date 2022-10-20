package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

public class MainListagemCategoria {


	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory= new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();
		
		CategoriaDAO categoria = new CategoriaDAO(connection);
		
		categoria.listaCategoria();
		
		
		
//		try(PreparedStatement statement = connection.prepareStatement("SELECT * FROM comex.categoria")){
//				statement.execute();
//		
//				try(ResultSet resultado = statement.getResultSet()){
//		
//					while(resultado.next()) {
//			
//						String id = resultado.getString(1);
//						System.out.print(id + " -  ");
//						String nome= resultado.getString("nome" );
//						System.out.print(nome + " -  ");
//						String status= resultado.getString("status");
//						System.out.println(status);
//					}
//				}
//			}
		}
}
