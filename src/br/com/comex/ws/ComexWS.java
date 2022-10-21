package br.com.comex.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.DAOs.ClienteDAO;
import br.com.comex.DAOs.ProdutoDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;

@WebService
public class ComexWS {
	
	
		Connection connection = new ConnectionFactory().recuperaConexao();
	
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		@WebMethod(operationName = "listarCategorias")
		public List<Categoria> getCategorias() throws SQLException{
		
		List<Categoria> listarCategorias = categoriaDao.listaCategoria(); 
	
		return listarCategorias;
		}
		
		@WebMethod(operationName = "adicionaCategoria")
		public Categoria adicionarCategoria(Categoria categoria) throws SQLException {
			String sql = "INSERT INTO comex.categoria (nome, status) VALUES (?, ?)";
			String[] retornaColuna = { "id" };
			
			try(PreparedStatement statement = connection.prepareStatement(sql, retornaColuna)){
					statement.setString(1, categoria.getNome());
					statement.setString(2, categoria.getStatus().name());
					statement.execute();
					ResultSet result = statement.getGeneratedKeys();
					result.next();
					categoria.setId(result.getInt(1));
					return categoria;
			}
		}
		
		ClienteDAO clienteDao = new ClienteDAO(connection);
		@WebMethod(operationName = "listagemClientes")
		public List<Cliente> listarCliente() throws SQLException{
		
		List<Cliente> listarClientes = clienteDao.listaCliente(); 
	
		return listarClientes;
		}
		
		@WebMethod(operationName = "insereClientes")
		public Cliente adicionarCliente(Cliente cliente) throws SQLException {
			String sql = "INSERT INTO comex.cliente (nome, cpf, telefone, rua, numero, complemento, bairro, cidade, uf) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			String[] retornaColuna = { "id" };
			
			try(PreparedStatement statement = connection.prepareStatement(sql, retornaColuna)){
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
					return cliente;
			}
		}
		
		ProdutoDAO produtoDao = new ProdutoDAO(connection);
		
		public List<Produto> listarProdutos() throws SQLException{
		
		List<Produto> listarProdutos = produtoDao.listaProduto(); 
	
		return listarProdutos;
		}
		
}
