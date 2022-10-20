package br.com.comex.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Pedido;

public class PedidoDAO {
	
	private Connection conexao;
	
	public PedidoDAO(Connection conexao) { 
		this.conexao = conexao;
	}
		

	public void inserePedido(Pedido pedido) throws SQLException {
		String sql = "INSERT INTO comex.pedido (data, cliente_id) VALUES (?, ?)";

		String[] retornaColuna = { "id" };
		
		try(PreparedStatement statement = conexao.prepareStatement(sql, retornaColuna)){
			statement.setString(1, pedido.getData());
			statement.setInt(2, pedido.getId());
			statement.execute();

				ResultSet result = statement.getGeneratedKeys();
				result.next();
		
				pedido.setId(result.getInt(1));

		}
	}
	
	public List<Pedido> listaPedido() throws SQLException {
		PreparedStatement comandoPreparado = conexao.prepareStatement("SELECT * FROM comex.pedido");
		
		List<Pedido> pedidos = new ArrayList<>();
		ResultSet registros = comandoPreparado.executeQuery();
		while (registros.next()) {
			pedidos.add(this.populaPedido(registros));
		}
		
		registros.close();
		comandoPreparado.close();
		
		return pedidos;
	}
	
	public void excluiPedido(Long id) throws SQLException {
		String sql = "DELETE FROM comex.pedido WHERE id = ?";
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			statement.setLong(1, id);
			statement.execute();
		}
		
	}
	
	public void alteraPedido(Pedido pedido) throws SQLException {
		String sql = "UPDATE comex.pedido SET data = ?, cliente_id = ?";
		
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			
			statement.setString(1, pedido.getData());
			statement.setInt(2, pedido.getId());
			statement.execute();
		
		}
		
	}

	
	public Pedido PegaIdPedido(int id) throws SQLException {
		String sql = "SELECT * FROM comex.pedido WHERE id = ?";
		
		try (PreparedStatement statement = this.conexao.prepareStatement(sql)) {
			statement.setInt(1, id);
			
			try (ResultSet registro = statement.executeQuery()) {
				Pedido pedido = null;
				if (registro.next()) {
					pedido = this.populaPedido(registro);
				}
					
				return pedido;
			}
		}
	}
	
	private Pedido populaPedido(ResultSet registro) throws SQLException {
		Pedido pedido = new Pedido(
				registro.getInt("id"), 
				registro.getString("data"), 
				registro.getInt("cliente_id")
				);
				
		
		pedido.setId(registro.getInt("id"));
		return pedido;
	}
	
}
