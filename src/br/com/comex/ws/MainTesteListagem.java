package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainTesteListagem {
	
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().recuperaConexao();
		
	}
	
	
	
}
