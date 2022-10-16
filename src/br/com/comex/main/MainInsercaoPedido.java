package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class MainInsercaoPedido {
	
	public static void main(String[] args) throws SQLException {
	 
			ConnectionFactory connectionFactory= new ConnectionFactory();
			try(Connection connection = connectionFactory.recuperaConexao()){
		
				connection.setAutoCommit(false);
		
				String[] retornaColuna = {"id"};
		
					try(PreparedStatement statement = connection.prepareStatement
																("INSERT INTO comex.pedido (data, cliente_id) VALUES (?, ?)", retornaColuna)) {
			 
							adicionaVariavel(new Pedido("23/05/2022", new Cliente(8)), statement);
			
							adicionaVariavel(new Pedido("14/07/2022", new Cliente(9)), statement);
			
							adicionaVariavel(new Pedido("28/09/2022", new Cliente(10)), statement);
	
							System.out.println("Dados inseridos com sucesso, conexão encerrada.");
							connection.commit();
					}
					catch (Exception e) {
						e.printStackTrace();
						System.out.println("Rollback executado");
						connection.rollback();
					}
			}
	}
	        
	private static void adicionaVariavel(Pedido pedido, PreparedStatement statement) throws SQLException {
		statement.setString(1, pedido.getData());
		statement.setInt(2, pedido.getCliente().getId());
		statement.execute();
		
		ResultSet result = statement.getGeneratedKeys();
	
		while(result.next()) {
			System.out.println(" " + result.getLong(1) + " ");
			
		}
	
	}
	
}
