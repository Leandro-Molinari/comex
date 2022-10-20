package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

@WebService
public class ComexWS {
	
	
		Connection connection = new ConnectionFactory().recuperaConexao();
	
		CategoriaDAO categoriaDao = new CategoriaDAO(connection);
	
		public List<Categoria> getCategorias(){
		
		List<Categoria> listarCategorias = categoriaDao.listaCategoria(); 
		
		return listarCategorias;
		}
		
}
