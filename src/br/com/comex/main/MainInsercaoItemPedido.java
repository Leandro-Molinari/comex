package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.ItemPedido.TipoDesconto;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class MainInsercaoItemPedido {
	
	public static void main(String[] args) throws SQLException {
			
			ConnectionFactory connectionFactory= new ConnectionFactory();
			try(Connection connection = connectionFactory.recuperaConexao()){
		
				connection.setAutoCommit(false);
		
				ItemPedido itemPedido = new ItemPedido();
				
				String[] retornaColuna = {"id"};
		
					try(PreparedStatement statement = connection.prepareStatement
							("INSERT INTO comex.item_pedido (preco_unitario, quantidade, produto_id, pedido_id, desconto, tipo_desconto) VALUES (?, ?, ?, ?, ?, ?)", retornaColuna)) {
			 
							adicionaVariavel(new ItemPedido(3523.20, 20, new Produto(10), new Pedido(10), itemPedido.calculaDesconto(), TipoDesconto.PROMOCAO ), statement);
							adicionaVariavel(new ItemPedido(102.90,2, new Produto(9), new Pedido(8), itemPedido.calculaDesconto(), TipoDesconto.NENHUM ), statement);
							adicionaVariavel(new ItemPedido(3523.20,18, new Produto(8), new Pedido(8), itemPedido.calculaDesconto(), TipoDesconto.NENHUM ), statement);

							System.out.println("Dados inseridos com sucesso, conexão encerrada.");
							connection.commit();
					}
					catch (Exception e) {
						e.printStackTrace();
						System.out.println("Rollback executado");
						connection.rollback();
					}
			}
	}
	        
	private static void adicionaVariavel(ItemPedido ItemPedido, PreparedStatement statement) throws SQLException {
		statement.setDouble(1, ItemPedido.getPreco_Unitario());
		statement.setInt(2, ItemPedido.getQuantidade());
		statement.setInt(3, ItemPedido.getProduto().getId());
		statement.setInt(4, ItemPedido.getPedido().getId());
		statement.setDouble(5, ItemPedido.getcalculaDesconto());
		statement.setString(6, ItemPedido.getTipo_Desconto().name());
		statement.execute();
		
		ResultSet result = statement.getGeneratedKeys();
	
		while(result.next()) {
			System.out.println(" " + result.getLong(1) + " ");
			
		}
	
	}
	
}
