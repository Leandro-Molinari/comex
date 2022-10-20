package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory= new ConnectionFactory();
		try(Connection connection = connectionFactory.recuperaConexao()){
		
			try(PreparedStatement statement = connection.prepareStatement("DELETE FROM comex.categoria where id = '9'")){
		
				statement.execute();
				Integer exclusoes = statement.getUpdateCount();
				System.out.println("Total de linhas excluidas: " + exclusoes);
				System.out.println("Campos excluídos com sucesso, conexão fechada");
			}
		}
	}
}
