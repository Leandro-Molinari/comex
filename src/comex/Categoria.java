package comex;

public class Categoria {
	
		
		private static int contador = 1;
		private int id;
		private String nome;
		//private String nomeStatus;
		private StatusCategoria status = StatusCategoria.ATIVA;
		
		public Categoria (int id, String nome, String nomeStatus) {
			
			if (id != contador) {
				throw new IllegalArgumentException ("Id inválido ou duplicado! O PRÓXIMO Id DISPONÍVEL É '" + contador + "'");
			}

			if (nome.length() <= 3) {
				throw new IllegalArgumentException ("Nome deve ter no minimo 4 caracteres");
			}
			
			if(nomeStatus != "ATIVA" && nomeStatus != "INATIVA") {
				throw new IllegalArgumentException("Categoria inválida, informar como ATIVA ou INATIVA (em maiúsculas");
			}
				
			if(nomeStatus == "ATIVA") {
					this.status = StatusCategoria.ATIVA;
			}
			
			if(nomeStatus == "INATIVA") {
					this.status = StatusCategoria.INATIVA; 
			}
			
			this.id = id;
			this.nome = nome;
			contador ++; 
		}
		
		
		public Categoria (String nome, String nomeStatus) {
			
			//if (id != contador) {
			//	throw new IllegalArgumentException ("Id inválido ou duplicado");
			//}

			if (nome.length() <= 3) {
				throw new IllegalArgumentException ("Nome deve ter no minimo 4 caracteres");
			}
			
			if(nomeStatus != "ATIVA" && nomeStatus != "INATIVA") {
				throw new IllegalArgumentException("Status Inválido");
			}
				
			if(nomeStatus == "ATIVA") {
					this.status = StatusCategoria.ATIVA;
			}
			
			if(nomeStatus == "INATIVA") {
					this.status = StatusCategoria.INATIVA; 
			}
			
			this.id = contador;
			this.nome = nome;
			contador ++; 
		}
		
		
		
		/*
		public void contador() {
			id = contador;
			contador ++;
				}
		*/
		
		
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
		public void setStatus(StatusCategoria status) {
			this.status = status;
		}
		
		
		
}
