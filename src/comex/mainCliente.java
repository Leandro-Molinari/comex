package comex;

public class mainCliente {

	public static void main(String[] args) {
		
			
		Cliente cliente1 = new Cliente("Ana", "123.456.789-10", "(41) 91234-5678", "Rua das Cacatuas", 
				"S/N", "Fundos", "Ipopeba", "Catanduvas", "PR");
			
		Cliente cliente2 = new Cliente("Eli", "456.789.101-12", "(41) 99101-1121", "Rua dos Bartucres", 
													"345", "Ap-081", "Carauru", "Intaprevale", "SP");
		
		Cliente cliente3 = new Cliente("Gabi", "314.151.617-18", "(41) 91011-1213", "Rua João da Luz", 
													"998", "Casa 2", "Parapaús", "Rio Molhado", "PA");
                         //|	  1     | Ana  | 123.456.789-10 | (41) 91234-5678 | Rua das Cacatuas |    S/N    |     Fundos       | Ipopeba  | Catanduvas | PR	 |   
System.out.println("| Código | Nome |         CPF           |        Telefone     |              Rua        | Numero | Complemento |   Bairro   |      Cidade   |  UF |  ");
		
		System.out.println("|     " + cliente1.getId() + "     |   " + cliente1.getNome() + "  | " + cliente1.getCpf() + " | " + 
				                   cliente1.getTelefone() + " | " + cliente1.getRua() + " |    " + cliente1.getNumero() + "    |       " + 
				                   cliente1.getComplemento() + "    |  " + cliente1.getBairro() + "  | " + cliente1.getCidade() + 
				                   " |  " + cliente1.getEstado() + " |");
		
		System.out.println("|     " + cliente2.getId() + "     |    " + cliente2.getNome() + "   | " + cliente2.getCpf() + " | " + 
                					cliente2.getTelefone() + " | " + cliente2.getRua() + "|    " + cliente2.getNumero() + "    |       " + 
                					cliente2.getComplemento() + "    |  " + cliente2.getBairro() + "  | " + cliente2.getCidade() + 
                					" |  " + cliente2.getEstado() + "  |");
		
		System.out.println("|     " + cliente3.getId() + "     |  " + cliente3.getNome() + "  | " + cliente3.getCpf() + " | " + 
									cliente3.getTelefone() + " |  " + cliente3.getRua() + "  |    " + cliente3.getNumero() + "    |       " + 
									cliente3.getComplemento() + "     | " + cliente3.getBairro() + " |" + cliente3.getCidade() + 
									" |  " + cliente3.getEstado() + " |");
	}

}
