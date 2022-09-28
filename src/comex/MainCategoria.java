package comex;

public class MainCategoria {

	public static void main(String[] args) {

			Categoria categoria1 = new Categoria("Informática", "ATIVA");
	     			
			Categoria categoria2 = new Categoria("Móveis", "INATIVA");
					
			Categoria categoria3 = new Categoria(3, "Livros", "ATIVA");
					
			System.out.println("Categoria " + categoria1.getNome() + " (" 
					+ categoria1.getId() + " - " + categoria1.getStatus() + ")");
			System.out.println("Categoria " + categoria2.getNome() + " (" 
										+ categoria2.getId() + " - " + categoria2.getStatus() + ")");
			
			System.out.println("Categoria " + categoria3.getNome() + " (" 
										+ categoria3.getId() + " - " + categoria3.getStatus() + ")");
			
	
	}

}
