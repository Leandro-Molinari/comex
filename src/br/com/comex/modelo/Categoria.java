package br.com.comex.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Categoria {
	
		
		private int id;
		private String nome;
		private StatusCategoria status = StatusCategoria.ATIVA;
		
		public Categoria() {
			super();
		}
		
		public Categoria (int id, String nome, StatusCategoria status) {
			
			if (nome.length() <= 3) {
				throw new ComexException ("Nome deve ter no minimo 4 caracteres");
			}
			
			 if(status == null) {
	                throw new ComexException("Categoria inválida, é obrigatória");
			 }  
			
			 this.id = id;
			this.nome = nome;
			this.status = status;
			}
		
		
		public Categoria (String nome, StatusCategoria status)  {
			
			//if (id != contador) {
			//	throw new IllegalArgumentException ("Id inválido ou duplicado");
			//}

			if (nome.length() <= 3) {
				throw new ComexException ("Nome deve ter no minimo 4 caracteres");
			}
			
						
			this.nome = nome;
			this.status = status;
			
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
		
		public StatusCategoria setStatus(StatusCategoria inativa) {
			return status;
		}
		
		public StatusCategoria getStatus() {
			return status;
		}

		@Override
		public String toString() {
			return "Categoria [id=" + id + ", nome=" + nome + ", status=" + status + "]" + System.lineSeparator();
		}
		
}
