package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
		public DataSource dataSource;
		
		public ConnectionFactory() {
			
				ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
				comboPooledDataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
				comboPooledDataSource.setUser("System");
				comboPooledDataSource.setPassword("brx");
				
				comboPooledDataSource.setMaxPoolSize(15);
				
				this.dataSource = comboPooledDataSource;
		}
	
		public Connection recuperaConexao() throws SQLException {
		
		return this.dataSource.getConnection();
		
	}
	
}
