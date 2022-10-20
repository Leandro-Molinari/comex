package br.com.comex.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.sql.DataSource;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.StatusCategoria;

@WebService	
public class ComexWS {

	public DataSource dataSource;	
	
public Connection recuperaConexao() throws SQLException {
		
		return this.dataSource.getConnection();
		
	}
	
	ConnectionFactory connectionFactory= new ConnectionFactory();
	Connection connection = connectionFactory.recuperaConexao();
	
	try(PreparedStatement statement = connection.prepareStatement("SELECT * FROM comex.categoria")){
			statement.execute();
	
			try(ResultSet resultado = statement.getResultSet()){
	
				while(resultado.next()) {
		
					String id = resultado.getString(1);
					System.out.print(id + " -  ");
					String nome= resultado.getString("nome" );
					System.out.print(nome + " -  ");
					String status= resultado.getString("status");
					System.out.println(status);
				}
			}
		}
	
}

//
//CategoriaDAO categoriaDAO = new CategoriaDAO();
//private Connection conexao;
//public CategoriaDAO(Connection conexao) { 
//	this.conexao = conexao;
//}
//public List<Categoria>getCategorias() throws SQLException{
//		
//		PreparedStatement comandoPreparado = conexao.prepareStatement("SELECT * FROM comex.categoria");
//		
//		List<Categoria> categorias = new ArrayList<>();
//		ResultSet registros = comandoPreparado.executeQuery();
//		while (registros.next()) {
//			categorias.add(this.populaCategoria(registros));
//		}
//		
//		registros.close();
//		comandoPreparado.close();
//		
//		return categorias;
//	}
//
//private Categoria populaCategoria(ResultSet registro) throws SQLException {
//	Categoria categoria = new Categoria(
//			registro.getInt("id"), 
//			registro.getString("nome"), 
//			StatusCategoria.valueOf((registro.getString("tipo"))));
//			
//	
//	categoria.setId(registro.getInt("id"));
//	return categoria;
//}	
//
//




