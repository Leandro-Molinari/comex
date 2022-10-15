package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Cliente.siglaEstado;

public class mainInsercaoCliente {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory= new ConnectionFactory();
		try(Connection connection = connectionFactory.recuperaConexao()){
			
			 connection.setAutoCommit(false);
			
			String[] retornaColuna = {"id"};
			
			try(PreparedStatement statement = connection.prepareStatement
																	("INSERT INTO comex.cliente (nome, cpf, telefone, rua, numero, complemento, cidade, bairro, uf) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", retornaColuna)) {
		
		adicionaVariavel(new Cliente("Ana","123.456.789-10","(41)96523-8745","Rua das Cacatuas","S/N","Fundos","Ipopeba","Catanduvas", siglaEstado.PR), statement);
		adicionaVariavel(new Cliente("Eli","456.789.101-12","(41) 99101-1121","Rua dos Bartucres","345","Ap-081","Carauru","Intaprevale", siglaEstado.SP), statement);
		adicionaVariavel(new Cliente("Gabi","314.151.617-18","(41) 91011-1213","Rua João da Luz","998","Casa 2","Parapaús","Rio Molhado", siglaEstado.PA), statement);		

		System.out.println();
		System.out.println("Cliente(s) adicionado(s) com sucesso");
		connection.commit();
		}
			catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Rollback executado");
	            connection.rollback();
	         }
		}
	}
	
	private static void adicionaVariavel(Cliente cliente, PreparedStatement statement) throws SQLException {
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getCpf());
		statement.setString(3, cliente.getTelefone());
		statement.setString(4, cliente.getRua());
		statement.setString(5, cliente.getNumero());
		statement.setString(6, cliente.getComplemento());
		statement.setString(7, cliente.getCidade());
		statement.setString(8, cliente.getBairro());
		statement.setString(9, cliente.getUf().name());
		statement.execute();
		
		ResultSet result = statement.getGeneratedKeys();
	
		while(result.next()) {
			System.out.print(" " + result.getLong(1) + " ");
			
		}
	}

	
}
