package br.com.comex.modelo;



public class Categoria {
	
		
		private static int contador = 1;
		private int id;
		private String nome;
		private StatusCategoria status = StatusCategoria.ATIVA;
		
		public Categoria (int id, String nome, StatusCategoria status) {
			
			if (id != contador) {
				throw new ComexException ("Id inválido ou duplicado! O PRÓXIMO Id DISPONÍVEL É '" + contador + "'");
			}

			if (nome.length() <= 3) {
				throw new ComexException ("Nome deve ter no minimo 4 caracteres");
			}
			
			 if(status == null) {
	                throw new ComexException("Categoria inválida, é obrigatória");
			 }  
			
			 this.id = id;
			this.nome = nome;
			this.status = status;
			contador ++; 
		}
		
		
		public Categoria (String nome, StatusCategoria status)  {
			
			//if (id != contador) {
			//	throw new IllegalArgumentException ("Id inválido ou duplicado");
			//}

			if (nome.length() <= 3) {
				throw new ComexException ("Nome deve ter no minimo 4 caracteres");
			}
			
						
			this.id = contador;
			this.nome = nome;
			this.status = status;
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
		public StatusCategoria getStatus() {
			return status;
		}
		
}
