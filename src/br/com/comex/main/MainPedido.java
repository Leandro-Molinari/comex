//package br.com.comex.main;
//
//import br.com.comex.modelo.Cliente;
//import br.com.comex.modelo.Pedido;
//import br.com.comex.modelo.Cliente.SiglaEstado;
//
//public class MainPedido {
//
//	public static void main(String[] args) {
//		Cliente cliente1 = new Cliente("Ana","123.456.789-10",null,"Rua das Cacatuas", 
//				"S/N","Fundos","Ipopeba","Catanduvas", SiglaEstado.PR);
//		Cliente cliente2 = new Cliente(2 ,"Eli","456.789.101-12","(41) 99101-1121","Rua dos Bartucres", 
//				"345","Ap-081","Carauru","Intaprevale", SiglaEstado.SP);
//		Cliente cliente3 = new Cliente("Gabi","314.151.617-18","(41) 91011-1213","Rua João da Luz", 
//				"998","Casa 2","Parapaús","Rio Molhado", SiglaEstado.PA);		
//		
//		Pedido pedido1 = new Pedido("23/05/2022", cliente1);
//		Pedido pedido2 = new Pedido("14/07/2022", cliente2);
//		Pedido pedido3 = new Pedido("28/09/2022", cliente3);
//		
//		System.out.println(" |   Id   |       Data       |  Nome |");
//		System.out.println(" |    " + pedido1.getId() +"   | " +  pedido1.getData() +"  |   " +  pedido1.getCliente().getNome() + "   |  " );
//		System.out.println(" |    " + pedido2.getId() +"   | " +  pedido2.getData() +"  |    " +  pedido2.getCliente().getNome() + "    |  " );
//		System.out.println(" |    " + pedido3.getId() +"   | " +  pedido3.getData() +"  |   " +  pedido3.getCliente().getNome() + "  |  " );
//
//	
//	}
//
//
//}
