package br.com.comex.modelo;

public class ProdutoIsento extends Produto {
	

	
	public ProdutoIsento(String nome, String descricao, double preco_Unitario, int quantidade_Estoque, int categoria_id, Tipo tipo) {
		super(nome, descricao, preco_Unitario, quantidade_Estoque, categoria_id, tipo);
		
				
		if (nome.length() <= 5) {
			throw new ComexException ("Nome do produto deve ter no mínimo 6 caracteres");
		}
		
		if (preco_Unitario <= 0) {
			throw new ComexException ("Preço não pode ser menor ou igual a zero");
		}
		
		if (quantidade_Estoque <= 0) {
			throw new ComexException ("Quantidade não pode estar zerada");
		}
	}	

	public double imposto(double imposto) {
		imposto = 0;
		return imposto;
	}
	
	
	
}