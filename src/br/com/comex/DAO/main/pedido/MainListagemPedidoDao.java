package br.com.comex.DAO.main.pedido;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;

public class MainListagemPedidoDao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexao();
		
		PedidoDAO pedidoDAO = new PedidoDAO(connection);
		
		pedidoDAO.listaPedido();		
	}	
}