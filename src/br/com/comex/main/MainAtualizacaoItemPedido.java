package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoItemPedido {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory= new ConnectionFactory();
		try(Connection connection = connectionFactory.recuperaConexao()){
		
			
			try(PreparedStatement statement = connection.prepareStatement("UPDATE comex.item_pedido SET desconto = "
				+ "0.2 WHERE desconto = 30.2")){
		
				statement.execute();
		
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
		}
		}	

}
