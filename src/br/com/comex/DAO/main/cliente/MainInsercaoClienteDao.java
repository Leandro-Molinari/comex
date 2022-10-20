package br.com.comex.DAO.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.ClienteDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainInsercaoClienteDao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexao();
		
		ClienteDAO clienteDAO = new ClienteDAO(connection);
		
		clienteDAO.insereCliente();
		
	}
	
}