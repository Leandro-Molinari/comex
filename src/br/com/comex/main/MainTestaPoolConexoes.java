package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainTestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory= new ConnectionFactory();
		
		    int j = 0;
		for (int i = 0; i < 20; i++) {
		    
			 j = j + 1;
			
			connectionFactory.recuperaConexao();
			
			System.out.println("Conexão " + j + " efetuada com sucesso!");
		}
		
	}

}





