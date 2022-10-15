package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoProduto {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory= new ConnectionFactory();
		try(Connection connection = connectionFactory.recuperaConexao()){
		
			
			try(PreparedStatement statement = connection.prepareStatement("UPDATE comex.produto SET descricao = "
				+ "'Tela de 15'', 16Gb RAM, SSD 512 Gb' WHERE id = '8'")){
		
				statement.execute();
		
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
		}
		}	

}
