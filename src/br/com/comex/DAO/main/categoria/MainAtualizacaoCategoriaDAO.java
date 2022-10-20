package br.com.comex.DAO.main.categoria;
import java.sql.Connection;
import java.sql.SQLException;
import br.com.comex.DAOs.CategoriaDAO;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizacaoCategoriaDAO {

	public static void main(String[] args) throws SQLException {

		try(Connection connection= new ConnectionFactory().recuperaConexao()){
		     CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
		     Categoria categoria = categoriaDAO.PegaIdCategoria(13);
		     categoria.setNome("ELETRODOMÉSTICOS");
		     categoriaDAO.alteraCategoria(categoria);
		}
						
		System.out.println("Dados alterados com sucesso, conexão fechada");
		}
}