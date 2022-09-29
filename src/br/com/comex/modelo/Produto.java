package br.com.comex.modelo;



public class Produto {
	
		protected static int contador = 1;
		private int id;
		private String nome;
		private String descricao;
		private double precoUnitario;
		private int quantidadeEmEstoque;
		private Categoria categoria;
		
		
		public Produto (int id, String nome, String descricao, double precoUnitario, int quantidadeEmEstoque, Categoria categoria){
			
			if (id != contador) {
				throw new IllegalArgumentException ("Id inválido, próximo número disponível: '" + contador + "'");
			}
			
			if (nome.length() <= 5) {
				throw new IllegalArgumentException ("Nome do produto deve ter no mínimo 6 caracteres");
			}
			
			if (precoUnitario <= 0) {
				throw new IllegalArgumentException ("Preço não pode ser menor ou igual a zero");
			}
			
			if (quantidadeEmEstoque <= 0) {
				throw new IllegalArgumentException ("Quantidade não pode estar zerada");
			}
			
			if (categoria == null) {
				throw new IllegalArgumentException ("Deve informar categoria");
			}
			
			this.id=id;
			this.nome=nome;
			this.descricao = descricao;
			this.precoUnitario=precoUnitario;
			this.quantidadeEmEstoque=quantidadeEmEstoque;
			this.categoria=categoria;
			contador++;
		}
		
public Produto (String nome, String descricao, double precoUnitario, int quantidadeEmEstoque, Categoria categoria){
			
			if (nome.length() <= 5) {
				throw new IllegalArgumentException ("Nome do produto deve ter no mínimo 6 caracteres");
			}
			
			if (precoUnitario <= 0) {
				throw new IllegalArgumentException ("Preço não pode ser menor ou igual a zero");
			}
			
			if (quantidadeEmEstoque <= 0) {
				throw new IllegalArgumentException ("Quantidade não pode estar zerada");
			}
			
			if (categoria == null) {
				throw new IllegalArgumentException ("Deve informar categoria");
			}
			
			this.id=contador;
			this.nome=nome;
			this.descricao = descricao;
			this.precoUnitario=precoUnitario;
			this.quantidadeEmEstoque=quantidadeEmEstoque;
			this.categoria=categoria;
			contador++;
		}
		

		public double totalEstoque(double totalEstoque) {
	       totalEstoque = this.precoUnitario * this.quantidadeEmEstoque;
	    		   return totalEstoque;
		}
		
		public double imposto(double imposto) {
			imposto = this.precoUnitario * 0.4;
			return imposto;
		}
		
		public void contador() {
			
			id = contador;
			contador ++;
			
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public double getPrecoUnitario() {
			return precoUnitario;
		}
		public void setPrecoUnitario(double precoUnitario) {
			this.precoUnitario = precoUnitario;
		}
		public int getQuantidadeEmEstoque() {
			return quantidadeEmEstoque;
		}
		public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
			this.quantidadeEmEstoque = quantidadeEmEstoque;
		}
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		

		

		
		
}
