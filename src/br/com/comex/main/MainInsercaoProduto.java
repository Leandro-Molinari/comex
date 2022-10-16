package br.com.comex.main;

import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Produto.tipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainInsercaoProduto {
	
	public static void main(String[] args) throws SQLException {
	 
			ConnectionFactory connectionFactory= new ConnectionFactory();
			try(Connection connection = connectionFactory.recuperaConexao()){
		
				connection.setAutoCommit(false);
		
				String[] retornaColuna = {"id"};
		
					try(PreparedStatement statement = connection.prepareStatement
																("INSERT INTO comex.produto (nome, descricao, preco_unitario,"
																		+ " quantidade_estoque, categoria_id, tipo) VALUES (?, ?, ?, ?, ?, ?)", retornaColuna)) {
			 
							adicionaVariavel(new Produto("Notebook Samsung", "Tela 14'', Processador i5 9ª geração, 32GB RAM, SSD 1GB", 13523.0, 1, 8,tipo.NAO_ISENTO), statement);
			
							adicionaVariavel(new Produto("Clean Architecture", "Autor:Robert Martin", 102.90, 2, 10, tipo.ISENTO), statement);
			
							adicionaVariavel(new Produto("Monitor Dell 27''", "Ultra HD, 16:9, 2 HDMI 2.0, Bivolt", 1889.00, 3, 8, tipo.NAO_ISENTO), statement);
	
							System.out.println("Dados inseridos com sucesso, conexão encerrada.");
							connection.commit();
					}
					catch (Exception e) {
						e.printStackTrace();
						System.out.println("Rollback executado");
						connection.rollback();
					}
			}
	}
	
	private static void adicionaVariavel(Produto produto, PreparedStatement statement) throws SQLException {
		statement.setString(1, produto.getNome());
		statement.setString(2, produto.getDescricao());
		statement.setDouble(3, produto.getPreco_Unitario());
		statement.setInt(4, produto.getQuantidade_Estoque());
		statement.setInt(5, produto.getCategoria_id());
		statement.setString(6, produto.getTipo().name());
		statement.execute();
		
		ResultSet result = statement.getGeneratedKeys();
	
		while(result.next()) {
			System.out.println(" " + result.getLong(1) + " ");
			
		}
	
	}
	
}
