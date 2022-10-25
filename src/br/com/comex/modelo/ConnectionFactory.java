package br.com.comex.modelo;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
		public DataSource dataSource;
		
		public ConnectionFactory() {
			
			try {
				ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
				comboPooledDataSource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
				comboPooledDataSource.setUser("System");
				comboPooledDataSource.setPassword("admin");
				
				comboPooledDataSource.setMaxPoolSize(15);
				
				this.dataSource = comboPooledDataSource;
			} catch (Exception e) {
				
			}
			
				
		}
	
		public Connection recuperaConexao()  {
			
			try {
				return this.dataSource.getConnection();
			} catch (Exception e) {
				
				
			}
			return null;
		
		
	}


}
