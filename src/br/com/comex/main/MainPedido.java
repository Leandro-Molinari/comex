package br.com.comex.main;

import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido("23/05/2022", 8);
		Pedido pedido2 = new Pedido("14/07/2022", 9);
		Pedido pedido3 = new Pedido("28/09/2022", 8);
		
		System.out.println(" |   Id   |       Data       |  Nome |");
		System.out.println(" |    " + pedido1.getId() +"   | " +  pedido1.getData() +"  |   " +  pedido1.getCliente_id() + "   |  " );
		System.out.println(" |    " + pedido2.getId() +"   | " +  pedido2.getData() +"  |    " +  pedido2.getCliente_id() + "    |  " );
		System.out.println(" |    " + pedido3.getId() +"   | " +  pedido3.getData() +"  |   " +  pedido3.getCliente_id() + "  |  " );

	
	}


}
