package br.com.comex.modelo;

public class ItemPedido {
	
	private int id;
	private double preco_Unitario;
	private int quantidade;
	private Produto produto_id;
	private Pedido pedido_id;
	private double desconto;
	private TipoDesconto tipo_Desconto;
	
	public enum TipoDesconto{
		
		NENHUM, PROMOCAO;
		
	}
	
	public ItemPedido() {
		
	}
	
	
	public ItemPedido (int id, double preco_Unitario, int quantidade, Produto produto_id, 
			Pedido pedido_id, double desconto, TipoDesconto tipo_Desconto) {

		this.id = id;
		this.preco_Unitario = preco_Unitario;
		this.quantidade = quantidade;
		this.produto_id = produto_id;
		this.pedido_id = pedido_id;
		this.tipo_Desconto = tipo_Desconto;


	}	
	
	public ItemPedido (double preco_Unitario, int quantidade, Produto produto_id, 
								Pedido pedido_id, double desconto, TipoDesconto tipo_Desconto) {
		
	
		this.preco_Unitario = preco_Unitario;
		this.quantidade = quantidade;
		this.produto_id = produto_id;
		this.pedido_id = pedido_id;
		this.tipo_Desconto = tipo_Desconto;
		
	}
	
	public double PrecoTotalSemDesconto() {
		double precoTotal = preco_Unitario * quantidade;
		return precoTotal;
	}
	
	public double calculaDesconto() {
	
	if(tipo_Desconto != TipoDesconto.NENHUM && tipo_Desconto != TipoDesconto.PROMOCAO) {
		System.out.println("Tipo de desconto inválido");
	} else {
			if(tipo_Desconto == TipoDesconto.NENHUM && quantidade <= 10) {
				desconto = 0;
			}else {
					if (tipo_Desconto == TipoDesconto.NENHUM && quantidade > 10) {
						desconto = 0.1;
					}else {
						if(tipo_Desconto == TipoDesconto.PROMOCAO) {
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
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public double getPreco_Unitario() {
		return preco_Unitario;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
	
	public TipoDesconto getTipo_Desconto() {
		return tipo_Desconto;
	}

	public double getcalculaDesconto() {
		return calculaDesconto();
	}

	
	

	}
