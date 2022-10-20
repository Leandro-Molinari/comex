package br.com.comex.modelo;

public class Pedido {

	
	private int id;
	private String data;
	private int cliente_id;

	public Pedido (int id, String data, int cliente_id) {
		
		this.id = id;
		this.data = data;
		this.cliente_id = cliente_id;
		
	}
	
	
		public Pedido (String data, int cliente_id) {
	
			this.data = data;
			this.cliente_id = cliente_id;
			
		}

		public Pedido (int id) {
			this.id = id;
		}
		
			public int getId() {
			return id;
		}
		
		public void setData(String data) {
			this.data = data;
		}
		public String getData() {
			return data;
		}
		
		public void setCliente_id(int cliente_id) {
			this.cliente_id = cliente_id;
		}
		public int getCliente_id() {
			return cliente_id;
		}

		public void setId(int id) {
			this.id = id;
			
		}

		public void setNome(String string) {
					
		}
}
