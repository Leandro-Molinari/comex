package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;
//import java.util.List;

public class MainListagemCliente {


	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory= new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();
		
		try(PreparedStatement statement = connection.prepareStatement("SELECT * FROM comex.cliente")){
				statement.execute();
		
				try(ResultSet resultado = statement.getResultSet()){
		
					while(resultado.next()) {
			
						String id = resultado.getString(1);
						System.out.print(id + " -  ");
						String nome= resultado.getString("nome" );
						System.out.print(nome + " -  ");
						String cpf= resultado.getString("cpf");
						System.out.print(cpf + " -  ");
						String telefone= resultado.getString("telefone");
						System.out.print(telefone + " -  ");
						String rua= resultado.getString("rua");
						System.out.print(rua + " -  ");
						String numero= resultado.getString("numero");
						System.out.print(numero + " -  ");
						String complemento= resultado.getString("complemento");
						System.out.print(complemento + " -  ");
						String bairro= resultado.getString("bairro");
						System.out.print(bairro + " -  ");
						String cidade= resultado.getString("cidade");
						System.out.print(cidade + " -  ");
						String uf= resultado.getString("uf");
						System.out.println(uf);
						
					}
				}
			}
		}
}
