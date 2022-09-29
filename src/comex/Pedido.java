package comex;

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
	
	public int getId() {
		return id;
	}
	public String getData() {
		return data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
}
