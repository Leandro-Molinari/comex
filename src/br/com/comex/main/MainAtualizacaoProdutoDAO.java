package br.com.comex.main;

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
		     produto.setPreco_Unitario(17880.20);
		     produtoDAO.alteraProduto(produto);
		}
			
					
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
		
		

}
