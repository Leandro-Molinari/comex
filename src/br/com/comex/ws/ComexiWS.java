package br.com.comex.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

@WebService
public class ComexiWS {

	//private final Connection conexao = null;
	
	
		@WebMethod(operationName ="todosOsItens")
		@WebResult(name = "itens")
		public List<Categoria> listaCategoria() throws SQLException {
			ConnectionFactory connectionFactory= new ConnectionFactory();
			Connection connection = connectionFactory.recuperaConexao();
//			PreparedStatement comandoPreparado = connection.prepareStatement("SELECT * FROM comex.categoria");
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
		  System.out.println("Chamando getItens()");
//		  List<Categoria> categorias = new ArrayList<>();
//			ResultSet registros = comandoPreparado.executeQuery();
//			while (registros.next()) {
//				categorias.add(null);
//			}
//			
//			registros.close();
//			comandoPreparado.close();
//			
			return null;
		}
 
          
          
          
//		  System.out.println("Chamando getItens()");
//		  return  lista;
//	  }
	  
}
