package br.com.comex.modelo;

public class Pedido {

	private static int contador = 1;
	private int id;
	private String data;
	private Cliente cliente;

		public Pedido (String data, Cliente cliente) {
	
			this.id = contador;
			this.data = data;
			this.cliente = cliente;
			contador++;
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
		
		public Cliente getCliente() {
			return cliente;
		}

		public void setId(int id) {
			this.id = id;
			
		}

	
		
		
}
