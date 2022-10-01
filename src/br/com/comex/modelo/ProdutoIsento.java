package br.com.comex.modelo;



public class ProdutoIsento extends Produto {
	

	
	public ProdutoIsento(int id, String nome, String descricao, double precoUnitario, int quantidadeEmEstoque, Categoria categoria) {
		super(id, nome, descricao, precoUnitario, quantidadeEmEstoque, categoria);
		
		
		if (nome.length() <= 5) {
			throw new ComexException ("Nome do produto deve ter no mínimo 6 caracteres");
		}
		
		if (precoUnitario <= 0) {
			throw new ComexException ("Preço não pode ser menor ou igual a zero");
		}
		
		if (quantidadeEmEstoque <= 0) {
			throw new ComexException ("Quantidade não pode estar zerada");
		}
		
		if (categoria == null) {
			throw new ComexException ("Deve informar categoria");
		}
		
	}

	public ProdutoIsento (String nome, String descricao, double precoUnitario, int quantidadeEmEstoque, Categoria categoria){
		super(nome, descricao, precoUnitario, quantidadeEmEstoque, categoria);
		
				if (nome.length() <= 5) {
					throw new ComexException ("Nome do produto deve ter no mínimo 6 caracteres");
				}
				
				if (precoUnitario <= 0) {
					throw new ComexException ("Preço não pode ser menor ou igual a zero");
				}
				
				if (quantidadeEmEstoque <= 0) {
					throw new ComexException ("Quantidade não pode estar zerada");
				}
				
				if (categoria == null) {
					throw new ComexException ("Deve informar categoria");
				}
			
			}
	
	public double imposto(double imposto) {
		imposto = 0;
		return imposto;
	}
	
	
	
}