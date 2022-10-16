package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.comex.modelo.ConnectionFactory;

public class MainListagemItemPedido {


	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory= new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();
		
		try(PreparedStatement statement = connection.prepareStatement("SELECT * FROM comex.item_pedido")){
				statement.execute();
		
				try(ResultSet resultado = statement.getResultSet()){
		
					while(resultado.next()) {
			
						String id = resultado.getString(1);
						System.out.print(id + " -  ");
						String preco_unitario= resultado.getString("preco_unitario" );
						System.out.print(preco_unitario + " -  ");
						String quantidade= resultado.getString("quantidade");
						System.out.print(quantidade + " -  ");
						String produto_id= resultado.getString("produto_id");
						System.out.print(produto_id + " -  ");
						String pedido_id= resultado.getString("pedido_id");
						System.out.print(pedido_id + " -  ");
						String desconto= resultado.getString("desconto");
						System.out.print(desconto + " -  ");
						String tipo_desconto= resultado.getString("tipo_desconto");
						System.out.println(tipo_desconto);
					}
				}
			}
		}
}
