package br.com.comex.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;

public class CategoriaDAO {
	
	private Connection conexao;
	
	public CategoriaDAO(Connection conexao) { 
		this.conexao = conexao;
	}
		

	public void insereCategoria(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO comex.categoria (nome, status) VALUES (?, ?)";

		String[] retornaColuna = { "id" };
		
		try(PreparedStatement statement = conexao.prepareStatement(sql, retornaColuna)){
				statement.setString(1, categoria.getNome());
				statement.setString(2, categoria.getStatus().name());
				
				statement.execute();

				ResultSet result = statement.getGeneratedKeys();
				result.next();
		
				categoria.setId(result.getInt(1));

		}
	}
	
	public List<Categoria> listaCategoria() throws SQLException {
		PreparedStatement comandoPreparado = conexao.prepareStatement("SELECT * FROM comex.categoria");
		
		List<Categoria> categorias = new ArrayList<>();
		ResultSet registros = comandoPreparado.executeQuery();
		while (registros.next()) {
			categorias.add(this.populaCategoria(registros));
		}
		
		registros.close();
		comandoPreparado.close();
		
		return categorias;
	}
	
	public void excluiCategoria(Long id) throws SQLException {
		String sql = "DELETE FROM comex.categoria WHERE id = ?";
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			statement.setLong(1, id);
			statement.execute();
		}
		
	}
	
	public void alteraCategoria(Categoria categoria) throws SQLException {
		String sql = "UPDATE comex.categoria SET nome = ?, status = ?";
		
		
		try(PreparedStatement statement = conexao.prepareStatement(sql)){
			
			statement.setString(1, categoria.getNome());
			statement.setString(2, categoria.getStatus().name());
			statement.execute();
		
		}
		
	}

	
	public Categoria PegaIdCategoria(int id) throws SQLException {
		String sql = "SELECT * FROM comex.categoria WHERE id = ?";
		
		try (PreparedStatement statement = this.conexao.prepareStatement(sql)) {
			statement.setLong(1, id);
			
			try (ResultSet registro = statement.executeQuery()) {
				Categoria categoria = null;
				if (registro.next()) {
					categoria = this.populaCategoria(registro);
				}
					
				return categoria;
			}
		}
	}
	
	private Categoria populaCategoria(ResultSet registro) throws SQLException {
		Categoria categoria = new Categoria(
				registro.getInt("id"), 
				registro.getString("nome"), 
				registro.getString("status")
				);
		
		categoria.setId(registro.getInt("id"));
		return categoria;
	}

}
