package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory= new ConnectionFactory();
		try(Connection connection = connectionFactory.recuperaConexao()){
		
			
			try(PreparedStatement statement = connection.prepareStatement("UPDATE comex.categoria SET nome = 'LIVROS DIDÁTICOS' WHERE id = '10'")){
		
				statement.execute();
		
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
		}
		}	

}
