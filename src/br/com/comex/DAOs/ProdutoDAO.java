package br.com.comex.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Produto.Tipo;

public class ProdutoDAO {
	
	private Connection conexao;
	
	public ProdutoDAO(Connection conexao) { 
		this.conexao = conexao;
	}
		
	public void insereProduto(Produto produto) throws SQLException {
		String sql = "INSERT INTO comex.produto (nome, descricao, preco_unitario, quantidade_estoque, categoria_id, tipo) VALUES (?, ?, ?, ?, ?, ?)";

		String[] retornaColuna = { "id" };
		
		try(PreparedStatement statement = conexao.prepareStatement(sql, retornaColuna)){
				statement.setString(1, produto.getNome());
				statement.setString(2, produto.getDescricao());
				statement.setDouble(3, produto.getPreco_Unitario());
				statement.setInt(4, produto.getQuantidade_Estoque());
				statement.setInt(5, produto.getCategoria_id());
				statement.setString(6, produto.getTipo().name());
				statement.execute();

				ResultSet result = statement.getGeneratedKeys();
				result.next();
		
				produto.setId(result.getInt(1));

		}
	}
	
	public List<Produto> listaProduto() throws SQLException {
		PreparedStatement comandoPreparado = conexao.prepareStatement("SELECT * FROM comex.produto");
		
		List<Produto> produtos = new ArrayList<>();
		ResultSet registros = comandoPreparado.executeQuery();
		while (registros.next()) {
			produtos.add(this.populaProduto(registros));
		}
		
		System.out.println(produtos);
		registros.close();
		comandoPreparado.close();
		
		return produtos;
	}
	
	public void excluiProduto(Produto produto) throws SQLException {
		String sql = "DELETE FROM comex.produto WHERE id = ?";
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			statement.setLong(1, produto.getId());
			statement.execute();
		}
		
	}
	
	public void alteraProduto(Produto produto) throws SQLException {
		String sql = "UPDATE comex.produto SET nome = ?, descricao = ?, preco_unitario = ?, quantidade_estoque = ?, categoria_id = ?, tipo = ? WHERE id = ?";
		
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			
			statement.setString(1, produto.getNome());
			statement.setString(2, produto.getDescricao());
			statement.setDouble(3, produto.getPreco_Unitario());
			statement.setInt(4, produto.getQuantidade_Estoque());
			statement.setInt(5, produto.getCategoria_id());
			statement.setString(6, produto.getTipo().name());
			statement.setInt(7, produto.getId());
			statement.execute();
		
		}
		
	}

	
	public Produto PegaIdProduto(int id) throws SQLException {
		String sql = "SELECT * FROM comex.produto WHERE id = ?";
		
		try (PreparedStatement statement = this.conexao.prepareStatement(sql)) {
			statement.setLong(1, id);
			
			try (ResultSet registro = statement.executeQuery()) {
				Produto produto = null;
				if (registro.next()) {
					produto = this.populaProduto(registro);
				}
					
				return produto;
			}
		}
	}
	
	private Produto populaProduto(ResultSet registro) throws SQLException {
		Produto produto = new Produto(
				registro.getInt("id"), 
				registro.getString("nome"), 
				registro.getString("descricao"), 
				registro.getDouble("preco_Unitario"), 	
				registro.getInt("quantidade_Estoque"),
				registro.getInt("Categoria_id"),
				Tipo.valueOf((registro.getString("tipo")))
				);
		
		
		
		produto.setId(registro.getInt("id"));
		return produto;
	}

}
