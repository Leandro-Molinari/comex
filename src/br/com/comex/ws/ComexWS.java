package br.com.comex.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

@WebService
public class ComexWS {
	
	
		Connection connection = new ConnectionFactory().recuperaConexao();
	
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
		@WebMethod(operationName = "listagemCategorias")
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
		
}
