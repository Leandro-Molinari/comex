package br.com.comex.modelo;

public class ItemPedido {
	
	private static int contador = 1;
	private int id;
	private double preco_Unitario;
	private int quantidade;
	private Produto produto_id;
	private Pedido pedido_id;
	private double desconto;
	private tipoDesconto tipo_Desconto;
	
	public enum tipoDesconto{
		
		NENHUM, PROMOCAO;
		
	}
	
	public ItemPedido() {
		
	}
	
	public ItemPedido (double preco_Unitario, int quantidade, Produto produto_id, 
								Pedido pedido_id, double desconto, tipoDesconto tipo_Desconto) {
		
		this.id = contador;
		this.preco_Unitario = preco_Unitario;
		this.quantidade = quantidade;
		this.produto_id = produto_id;
		this.pedido_id = pedido_id;
		this.tipo_Desconto = tipo_Desconto;
		
		contador++;
	}
	
	public double PrecoTotalSemDesconto() {
		double precoTotal = preco_Unitario * quantidade;
		return precoTotal;
	}
	
	public double calculaDesconto() {
	
	if(tipo_Desconto != tipoDesconto.NENHUM && tipo_Desconto != tipoDesconto.PROMOCAO) {
		System.out.println("Tipo de desconto inválido");
	} else {
			if(tipo_Desconto == tipoDesconto.NENHUM && quantidade <= 10) {
				desconto = 0;
			}else {
					if (tipo_Desconto == tipoDesconto.NENHUM && quantidade > 10) {
						desconto = 0.1;
					}else {
						if(tipo_Desconto == tipoDesconto.PROMOCAO) {
							desconto = 0.2;
						}
						
					}
			}	
	}
	return desconto;
}	
 
	public ItemPedido (double desconto) {
		this.desconto=desconto;
	}
	
	public double precoTotalComDesconto(){
		
		double PrecoTotalSemDesconto = PrecoTotalSemDesconto() - (PrecoTotalSemDesconto() * desconto);
		return PrecoTotalSemDesconto;
	}
	
	public int getId() {
		return id;
	}

	public double getPreco_Unitario() {
		return preco_Unitario;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
//	public Cliente getCliente() {
//		return cliente;
//	}
	
	public Produto getProduto() {
		return produto_id;
	}

	public Pedido getPedido() {
		return pedido_id;
	}

	public double getDesconto() {
		return desconto;
	}
	
	public tipoDesconto getTipo_Desconto() {
		return tipo_Desconto;
	}

	public double getcalculaDesconto() {
		return calculaDesconto();
	}
}
