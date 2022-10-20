package br.com.comex.DAO.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.ClienteDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Cliente.SiglaEstado;

public class MainInsercaoClienteDao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexao();
		ClienteDAO clienteDAO = new ClienteDAO(connection);
		Cliente cliente = new Cliente(0);
		cliente.setNome("Marcio");
		cliente.setCpf("056.452.985-00"); 
		cliente.setTelefone("(83)59652-7862");	
		cliente.setRua("Alameda das Horliças");
		cliente.setNumero("22");
		cliente.setComplemento("casa 7");
		cliente.setBairro("Mireias");
		cliente.setCidade("Ilinópolis");
		cliente.setUf(SiglaEstado.MT);
		clienteDAO.insereCliente(cliente);
	}


	
}