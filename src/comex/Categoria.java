package comex;

public class Categoria {
	
		
		private static int contador = 1;
		private int id;
		private String nome;
		private StatusCategoria status = StatusCategoria.ATIVA;
		
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
		public StatusCategoria getStatus() {
			return status;
		}
		public void setStatus(StatusCategoria status) {
			this.status = status;
		}
		
		
		
}
