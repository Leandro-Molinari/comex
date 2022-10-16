package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import br.com.comex.modelo.ConnectionFactory;

public class MainListagemPedido {


	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory= new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();
		
		try(PreparedStatement statement = connection.prepareStatement("SELECT * FROM comex.pedido")){
				statement.execute();
		
				try(ResultSet resultado = statement.getResultSet()){
		
					while(resultado.next()) {
			
						String id = resultado.getString(1);
						System.out.print(id + " -  ");
						Date data= resultado.getDate("data" );
						System.out.print(data + " -  ");
						String status= resultado.getString("cliente_id");
						System.out.println(status);
					}
				}
			}
		}
}
