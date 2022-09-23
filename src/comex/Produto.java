package comex;

public class Produto {
	
		private static int id = 1;
		private String nome;
		private String descricao;
		private double precoUnitario;
		private int quantidadeEmEstoque;
		private String categoria;
		
		
		
		public double totalEstoque(double totalEstoque) {
	       totalEstoque = this.precoUnitario * this.quantidadeEmEstoque;
	    		   return totalEstoque;
		}
		
		public double imposto(double imposto) {
			imposto = this.precoUnitario * 0.4;
			return imposto;
		}
		
		public int getId() {
			return id++;
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
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		
		
}
