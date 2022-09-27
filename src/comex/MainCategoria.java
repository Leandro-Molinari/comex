package comex;

public class MainCategoria {

	public static void main(String[] args) {

			Categoria categoria1 = new Categoria();
			categoria1.contador();
			categoria1.setNome("Informática");
			categoria1.setStatus(StatusCategoria.ATIVA);

			
			Categoria categoria2 = new Categoria();
			categoria2.contador();
			categoria2.setNome("Móveis");
			categoria2.setStatus(StatusCategoria.INATIVA);
			
			
			Categoria categoria3 = new Categoria();
			categoria3.contador();
			categoria3.setNome("Livros");
			categoria3.setStatus(StatusCategoria.ATIVA);
			
			System.out.println("Categoria " + categoria1.getNome() + " (" 
					+ categoria1.getId() + " - " + categoria1.getStatus() + ")");
			System.out.println("Categoria " + categoria2.getNome() + " (" 
										+ categoria2.getId() + " - " + categoria2.getStatus() + ")");
			
			System.out.println("Categoria " + categoria3.getNome() + " (" 
										+ categoria3.getId() + " - " + categoria3.getStatus() + ")");
			
	
	}

}
