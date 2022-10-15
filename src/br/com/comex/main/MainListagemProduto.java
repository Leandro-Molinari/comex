package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;
//import java.util.List;

public class MainListagemProduto {


	public static void main(String[] args) throws SQLException {
		
	//	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "brx");
	
		ConnectionFactory connectionFactory= new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();
		
		try(PreparedStatement statement = connection.prepareStatement("SELECT * FROM comex.produto")){
				statement.execute();
		
				try(ResultSet resultado = statement.getResultSet()){
		
					while(resultado.next()) {
			
						String id = resultado.getString(1);
						System.out.print(id + " -  ");
						String nome= resultado.getString("nome" );
						System.out.print(nome + " -  ");
						String descricao= resultado.getString("descricao");
						System.out.print(descricao);
						System.out.print(id + " -  ");
						String preco_unitario= resultado.getString("preco_unitario" );
						System.out.print(preco_unitario + " -  ");
						String quantidade_estoque= resultado.getString("quantidade_estoque");
						System.out.print(quantidade_estoque);
						System.out.print(id + " -  ");
						String categoria_id= resultado.getString("categoria_id" );
						System.out.print(categoria_id + " -  ");
						String tipo= resultado.getString("tipo");
						System.out.println(tipo);
						
					}
				}
			}
		}
}
