package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.ItemPedidoDAO;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoItemPedidoDAO {

	public static void main(String[] args) throws SQLException {

		try(Connection connection= new ConnectionFactory().recuperaConexao()){
		     ItemPedidoDAO itemPedidoDAO = new ItemPedidoDAO(connection);
		     ItemPedido itemPedido = itemPedidoDAO.PegaIdItemPedido(8);
		     itemPedido.setQuantidade(6);
		     itemPedidoDAO.alteraItemPedido(itemPedido);
		}
			
					
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
		
		

}
