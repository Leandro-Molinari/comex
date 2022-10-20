package br.com.comex.DAO.main.pedido;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.DAOs.PedidoDAO;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoPedidoDAO {

	public static void main(String[] args) throws SQLException {

		try(Connection connection= new ConnectionFactory().recuperaConexao()){
		     PedidoDAO pedidoDAO = new PedidoDAO(connection);
		     Pedido pedido = pedidoDAO.PegaIdPedido(14);
		     pedidoDAO.excluiPedido(pedido);
		}			
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
}