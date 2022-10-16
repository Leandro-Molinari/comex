package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoItemPedido {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory= new ConnectionFactory();
		try(Connection connection = connectionFactory.recuperaConexao()){
		
			try(PreparedStatement statement = connection.prepareStatement("DELETE FROM comex.item_pedido where desconto = '0'")){
		
				statement.execute();
				Integer exclusoes = statement.getUpdateCount();
				System.out.println("Total de linhas excluidas: " + exclusoes);
				System.out.println("Campos excluídos com sucesso, conexão fechada");
			}
		}
	}
}
