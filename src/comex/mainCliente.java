package comex;

public class mainCliente {

	public static void main(String[] args) {
		
	//	Cliente id = new Cliente();
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Ana";
		
		
		
		Cliente.getId(),, "123.456.789-10", "(41) 91234-5678", "Rua das Cacatuas", 
		"S/N", "Fundos", "Ipopeba", "Catanduvas", "PR"
		
		Cliente cliente2 = new Cliente(Cliente.getId(),"Eli", "456.789.101-12", "(41) 99101-1121", "Rua dos Bartucres", 
													"345", "Ap-081", "Carauru", "Intaprevale", "SP");
		Cliente cliente3 = new Cliente(Cliente.getId(),"Gabi", "314.151.617-18", "(41) 91011-1213", "Rua João da Luz", 
													"998", "Casa 2", "Parapaús", "Rio Molhado", "PA");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getId());
	}

}
