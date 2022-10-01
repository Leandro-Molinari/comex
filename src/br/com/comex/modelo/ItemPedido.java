package br.com.comex.modelo;

//NÃO FINALIZADO

public class ItemPedido {
	
	private static int contador = 1;
	private int id;
	private Produto precoUnitario;
	private int quantidade;
	private Produto produto;
	private Pedido pedido;
	private double desconto;
	private String tipoDeDesconto;
		
	public ItemPedido (int quantidade, Produto produto, 
								Pedido pedido, String tipoDeDesconto) {
		
		this.id = contador;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.produto = produto;
		this.pedido = pedido;
		this.tipoDeDesconto = tipoDeDesconto;
		
		contador++;
	}
	
	public double PrecoTotalSemDesconto() {
		double precoTotal = precoUnitario * quantidade;
		return precoTotal;
	}
	
	public double calculaDesconto() {
	
	if(tipoDeDesconto != "NENHUM" && tipoDeDesconto != "PROMOÇÃO") {
		System.out.println("Tipo de desconto inválido");
	} else {
			if(tipoDeDesconto == "NENHUM" && quantidade <= 10) {
				desconto = 0.0;
			}else {
					if (tipoDeDesconto == "NENHUM" && quantidade > 10) {
						desconto = 0.1;
					}else {
						if(tipoDeDesconto == "PROMOÇÃO") {
							desconto = 0.2;
						}
						
					}
			}		
	}
	return desconto;
}	
	
	
	
	
	public double precoTotalComDesconto(){
		
		double PrecoTotalSemDesconto = PrecoTotalSemDesconto() - (PrecoTotalSemDesconto() * desconto);
		return PrecoTotalSemDesconto;
	}
	
	public int getId() {
		return id;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public double getDesconto() {
		return desconto;
	}

	public String getTipoDeDesconto() {
		return tipoDeDesconto;
	}
	
	
	
}
