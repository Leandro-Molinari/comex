package br.com.comex.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Cliente.SiglaEstado;

public class ClienteDAO {
	
	private Connection conexao;
	
	public ClienteDAO(Connection conexao) { 
		this.conexao = conexao;
	}
		

	public void insereCliente(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO comex.cliente (nome, cpf, telefone, rua, numero, complemento, bairro, cidade, uf) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
																																												
		String[] retornaColuna = { "id" };
		
		try(PreparedStatement statement = conexao.prepareStatement(sql, retornaColuna)){
			statement.setString(1, cliente.getNome());
			statement.setString(2, cliente.getCpf());
			statement.setString(3, cliente.getTelefone());
			statement.setString(4, cliente.getRua());
			statement.setString(5, cliente.getNumero());
			statement.setString(6, cliente.getComplemento());
			statement.setString(8, cliente.getBairro());
			statement.setString(7, cliente.getCidade());
			statement.setString(9, cliente.getUf().name());
			statement.execute();

				ResultSet result = statement.getGeneratedKeys();
				result.next();
		
				cliente.setId(result.getInt(1));

		}
	}
	
	public List<Cliente> listaCliente() throws SQLException {
		PreparedStatement comandoPreparado = conexao.prepareStatement("SELECT * FROM comex.cliente");
		
		List<Cliente> clientes = new ArrayList<>();
		ResultSet registros = comandoPreparado.executeQuery();
		while (registros.next()) {
			clientes.add(this.populaCliente(registros));
		}
		System.out.println(clientes);
		registros.close();
		comandoPreparado.close();
		
		return clientes;
	}
	
	public void excluiCliente(Cliente cliente) throws SQLException {
		String sql = "DELETE FROM comex.cliente WHERE id = ?";
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			statement.setInt(1, cliente.getId());
			statement.execute();
		}
		
	}
	
	public void alteraCliente(Cliente cliente) throws SQLException {
		String sql = "UPDATE comex.cliente SET nome = ?, cpf = ?, telefone = ?, rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?  WHERE id = ?";
		
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			
			statement.setString(1, cliente.getNome());
			statement.setString(2, cliente.getCpf());
			statement.setString(3, cliente.getTelefone());
			statement.setString(4, cliente.getRua());
			statement.setString(5, cliente.getNumero());
			statement.setString(6, cliente.getComplemento());
			statement.setString(8, cliente.getBairro());
			statement.setString(7, cliente.getCidade());
			statement.setString(9, cliente.getUf().name());
			statement.setInt(10, cliente.getId());
			statement.execute();
		
		}
		
	}

	
	public Cliente PegaIdCliente(int id) throws SQLException {
		String sql = "SELECT * FROM comex.cliente WHERE id = ?";
		
		try (PreparedStatement statement = this.conexao.prepareStatement(sql)) {
			statement.setLong(1, id);
			
			try (ResultSet registro = statement.executeQuery()) {
				Cliente cliente = null;
				if (registro.next()) {
					cliente = this.populaCliente(registro);
				}
					
				return cliente;
			}
		}
	}
	
	private Cliente populaCliente(ResultSet registro) throws SQLException {
		Cliente cliente = new Cliente(
				registro.getInt("id"), 
				registro.getString("nome"), 
				registro.getString("cpf"), 
				registro.getString("telefone"), 	
				registro.getString("rua"),
				registro.getString("numero"),
				registro.getString("complemento"),
				registro.getString("bairro"),
				registro.getString("cidade"),
				SiglaEstado.valueOf((registro.getString("uf")))
				);
						
		cliente.setId(registro.getInt("id"));
		return cliente;
	}


	public Cliente insereCliente() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
