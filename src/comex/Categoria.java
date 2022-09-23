package comex;

public class Categoria {
	
		
		private static int id = 1;
		private String nome;
		private StatusCategoria status = StatusCategoria.ATIVA;
		

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
		public StatusCategoria getStatus() {
			return status;
		}
		public void setStatus(StatusCategoria status) {
			this.status = status;
		}
		
		
		
}
