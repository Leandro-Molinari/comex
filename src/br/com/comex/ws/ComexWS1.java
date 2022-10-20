package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;

@WebService
public class ComexWS1 {

	private final Connection conexao = null;
	private CategoriaDAO categoriaDAO = new CategoriaDAO(conexao);
	
		@WebMethod(operationName="todosOsItens")
		@WebResult(name = "itens")
	  public List<Categoria> getItens() throws SQLException{
		  
		  System.out.println("Chamando getItens()");
          List<Categoria> lista = null;
 //	  Categoria lista = null;
//		try {
//			lista = (Categoria) CategoriaDAO.listaCategoria();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		  System.out.println("Chamando getItens()");
		  return  lista;
	  }
	  
}
