package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.StatusCategoria;

public class MainInsercaoCategoriaDAO{
	
	public static void main(String[] args) throws SQLException {

		try(Connection connection= new ConnectionFactory().recuperaConexao()){
		     CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		     Categoria categoria = categoriaDAO.populaCategoria(Categoria);
		     categoria.setNome("TECNOLOGIA");
		     categoria.setStatus(StatusCategoria.ATIVA);
		     categoriaDAO.insereCategoria(categoria);
		}
			
					
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
	
	
	
	
	
	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
//
//	public static void main(String[] args) throws SQLException {
//		
//		ConnectionFactory connectionFactory= new ConnectionFactory();
//		try(Connection connection = connectionFactory.recuperaConexao()){
//			
//			 connection.setAutoCommit(false);
//			
//			String[] retornaColuna = {"id"};
//			
//			try(PreparedStatement statement = connection.prepareStatement
//																	("INSERT INTO comex.categoria (nome, status) VALUES (?, ?)", retornaColuna)) {
//				
//				adicionaVariavel(new Categoria("INFORMÁTICA", StatusCategoria.ATIVA), statement);
//				adicionaVariavel(new Categoria("MÓVEIS", StatusCategoria.INATIVA), statement);
//				adicionaVariavel(new Categoria("LIVROS", StatusCategoria.ATIVA), statement);
//				
//				System.out.println();
//				System.out.println("Dados inseridos com sucesso, conexão encerrada.");
//				connection.commit();
//			}
//			catch (Exception e) {
//	            e.printStackTrace();
//	            System.out.println("Rollback executado");
//	            connection.rollback();
//	         }
//		}
//	}
//	private static void adicionaVariavel(Categoria categoria, PreparedStatement statement) throws SQLException {
//		statement.setString(1, categoria.getNome());
//		statement.setString(2, categoria.getStatus().name());
//		statement.execute();
//		
//		ResultSet result = statement.getGeneratedKeys();
//	
//		while(result.next()) {
//			System.out.print(" " + result.getLong(1) + " ");
//			
//		}
//	}
//}
