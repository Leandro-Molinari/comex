package br.com.comex.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.ItemPedido.tipoDesconto;

public class ItemPedidoDAO {
	
	private Connection conexao;
	
	public ItemPedidoDAO(Connection conexao) { 
		this.conexao = conexao;
	}
		

	public void insereItemPedido(ItemPedido itemPedido) throws SQLException {
		String sql = "INSERT INTO comex.item_pedido (preco_unitario, quantidade, produto_id, pedido_id, desconto, tipo_desconto) VALUES (?, ?, ?, ?, ?, ?)";

		String[] retornaColuna = { "id" };
		
		try(PreparedStatement statement = conexao.prepareStatement(sql, retornaColuna)){
			statement.setDouble(1, itemPedido.getPreco_Unitario());
			statement.setInt(2, itemPedido.getQuantidade());
			statement.setInt(3, itemPedido.getProduto().getId());
			statement.setInt(4, itemPedido.getPedido().getId());
			statement.setDouble(5, itemPedido.getcalculaDesconto());
			statement.setString(6, itemPedido.getTipo_Desconto().name());
			statement.execute();

				ResultSet result = statement.getGeneratedKeys();
				result.next();
		
				itemPedido.setId(result.getInt(1));

		}
	}
	
	public List<ItemPedido> listaItemPedido() throws SQLException {
		PreparedStatement comandoPreparado = conexao.prepareStatement("SELECT * FROM comex.itemPedido");
		
		List<ItemPedido> itemPedidos = new ArrayList<>();
		ResultSet registros = comandoPreparado.executeQuery();
		while (registros.next()) {
			itemPedidos.add(this.populaItemPedido(registros));
		}
		
		registros.close();
		comandoPreparado.close();
		
		return itemPedidos;
	}
	
	public void excluiItemPedido(Long id) throws SQLException {
		String sql = "DELETE FROM comex.itemPedido WHERE id = ?";
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			statement.setLong(1, id);
			statement.execute();
		}
		
	}
	
	public void alteraItemPedido(ItemPedido itemPedido) throws SQLException {
		String sql = "UPDATE comex.item_pedido SET preco_unitario = ?, quantidade = ?, produto_id = ?, pedido_id = ?, desconto = ?, tipo_desconto = ?";
		
		String[] retornaColuna = { "id" };
		
		try(PreparedStatement statement = conexao.prepareStatement(sql, retornaColuna)){
			
			statement.setDouble(1, itemPedido.getPreco_Unitario());
            statement.setInt(2, itemPedido.getQuantidade());
            statement.setInt(3, itemPedido.getProduto().getId());
            statement.setInt(4, itemPedido.getPedido().getId());
            statement.setDouble(5, itemPedido.getcalculaDesconto());
            statement.setString(6, itemPedido.getTipo_Desconto().name());
            statement.execute();
			
		}
		
	}

	
	public ItemPedido PegaIdItemPedido(int id) throws SQLException {
		String sql = "SELECT * FROM comex.itemPedido WHERE id = ?";
		
		try (PreparedStatement statement = this.conexao.prepareStatement(sql)) {
			statement.setLong(1, id);
			
			try (ResultSet registro = statement.executeQuery()) {
				ItemPedido itemPedido = null;
				if (registro.next()) {
					itemPedido = this.populaItemPedido(registro);
				}
					
				return itemPedido;
			}
		}
	}
	
	private ItemPedido populaItemPedido(ResultSet registro) throws SQLException {
		ItemPedido itemPedido = new ItemPedido(
				registro.getInt("id"), 
				registro.getDouble("preco_unitario"), 
				registro.getInt("quantidade"), 
				new Produto(registro.getInt("produto_id")), 	
				new Pedido(registro.getInt("pedido_id")),
				registro.getDouble("desconto"),
				tipoDesconto.valueOf((registro.getString("tipo_Desconto")))
				);
			

		
		itemPedido.setId(registro.getInt("id"));
		return itemPedido;
	}

}
