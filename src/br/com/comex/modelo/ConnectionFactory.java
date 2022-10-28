package br.com.comex.modelo;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
		public DataSource dataSource;
		
		public ConnectionFactory() {
			
			String db = System.getenv("DATABASE_HOST");
				
			if (db == null || db.isEmpty()){
				db = "0.0.0.0";
			}
			
			try {
				ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
				comboPooledDataSource.setJdbcUrl("jdbc:oracle:thin:@" + db + ":1522:xe");
				comboPooledDataSource.setUser("System");
				comboPooledDataSource.setPassword("admin");
				
				comboPooledDataSource.setMaxPoolSize(15);
				
				this.dataSource = comboPooledDataSource;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			
				
		}
	
		public Connection recuperaConexao()  {
			
			try {
				return this.dataSource.getConnection();
			} catch (Exception e) {
				
				throw new RuntimeException(e);
				
			}
			
		
		
	}


}
