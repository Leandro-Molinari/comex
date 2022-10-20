package br.com.comex.DAO.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.ClienteDAO;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoClienteDAO {

	public static void main(String[] args) throws SQLException {

		try(Connection connection= new ConnectionFactory().recuperaConexao()){
		     ClienteDAO clienteDAO = new ClienteDAO(connection);
		     Cliente cliente = clienteDAO.PegaIdCliente(12);
		     clienteDAO.excluiCliente(cliente);
		}
			
					
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
		
		

}
