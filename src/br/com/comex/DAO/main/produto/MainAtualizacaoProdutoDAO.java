package br.com.comex.DAO.main.produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.DAOs.ProdutoDAO;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoProdutoDAO {

	public static void main(String[] args) throws SQLException {

		try(Connection connection= new ConnectionFactory().recuperaConexao()){
		     ProdutoDAO produtoDAO = new ProdutoDAO(connection);
		     Produto produto = produtoDAO.PegaIdProduto(8);
		     produto.setNome("Notebook Dell");
		     produtoDAO.alteraProduto(produto);
		}
			
					
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
		
		

}
