package br.com.comex.DAO.main.pedido;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.DAOs.PedidoDAO;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class MainInsercaoPedidoDao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().recuperaConexao();
		PedidoDAO pedidoDAO = new PedidoDAO(connection);
		Pedido pedido = new Pedido(0);
		pedido.setData("16/04/2022");
		pedido.setCliente_id(8); 
		pedidoDAO.inserePedido(pedido);		
	}	
}