package br.com.comex.modelo;

public class Pedido {

	private int id;
	private String data;
	private Cliente cliente;

	public Pedido (int id, String data, Cliente cliente) {
		
		this.id = id;
		this.data = data;
		this.cliente = cliente;
		
	}
	
	
		public Pedido (String data, Cliente cliente) {
	

			this.data = data;
			this.cliente = cliente;

		}

		public Pedido (int id) {
			this.id = id;
		}
		public int setId() {
			return this.id=id;
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
		
		public Cliente getCliente() {
			return cliente;
		}

		public void setId(int id) {
			this.id = id;
			
		}

	
		
		
}
