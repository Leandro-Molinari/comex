package br.com.comex.modelo;

public class Produto {
	
		private int id;
		private String nome;
		private String descricao;
		private double preco_Unitario;
		private int quantidade_Estoque;
		private int categoria_id;
		private Tipo tipo;
	
		
		
		public enum Tipo {
			
			ISENTO, NAO_ISENTO; 		
		}
		
		public Produto (int id) {
			this.id = id; 
		}
		
		public Produto (int id, String nome, String descricao, double preco_Unitario, int quantidade_Estoque, int categoria_id, Tipo tipo){
			
			if (nome.length() <= 5) {
				throw new ComexException ("Nome do produto deve ter no mínimo 6 caracteres");
			}
			
			if (preco_Unitario <= 0) {
				throw new ComexException ("Preço não pode ser menor ou igual a zero");
			}
			
			if (quantidade_Estoque <= 0) {
				throw new ComexException ("Quantidade não pode estar zerada");
			}
			
			this.id=id;
			this.nome=nome;
			this.descricao = descricao;
			this.preco_Unitario=preco_Unitario;
			this.quantidade_Estoque=quantidade_Estoque;
			this.categoria_id=categoria_id;
			this.tipo = tipo;
	
		}
		
public Produto (String nome, String descricao, double preco_Unitario, int quantidade_Estoque, int categoria_id, Tipo tipo){
			
			if (nome.length() <= 5) {
				throw new ComexException ("Nome do produto deve ter no mínimo 6 caracteres");
			}
			
			if (preco_Unitario <= 0) {
				throw new ComexException ("Preço não pode ser menor ou igual a zero");
			}
			
			if (quantidade_Estoque <= 0) {
				throw new ComexException ("Quantidade não pode estar zerada");
			}

			this.nome=nome;
			this.descricao = descricao;
			this.preco_Unitario=preco_Unitario;
			this.quantidade_Estoque=quantidade_Estoque;
			this.categoria_id=categoria_id;
			this.tipo = tipo;

		}
		
	
		public double totalEstoque(double totalEstoque) {
	       totalEstoque = this.preco_Unitario * this.quantidade_Estoque;
	    		   return totalEstoque;
		}
		
		public double imposto(double imposto) {
			imposto = this.preco_Unitario * 0.4;
			return imposto;
		}
		
			
		public int setId(int id) {
			return this.id = id;
		}
		public int getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}

		
		public String getDescricao() {
			return descricao;
		}

		
		public double getPreco_Unitario() {
			return preco_Unitario;
			
			 } public double setPreco_Unitario(double preco_Unitario) { 
				 return this.preco_Unitario = preco_Unitario;
			 
		}
		public int getQuantidade_Estoque() {
			return quantidade_Estoque;
		}

		
		public int getCategoria_id() {
			return categoria_id;
		}

		public Tipo setTipo(Tipo tipo) {
			return this.tipo = tipo;
			
		}

		public Tipo getTipo() {
			return tipo;
		}

}
