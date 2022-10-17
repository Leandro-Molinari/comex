package br.com.comex.ws;

import java.util.List;

import br.com.comex.modelo.Categoria;

public class ComexWS {

	  private Categoria categoria = new Categoria();
	
	  public List<Categoria> getItens(){
		  
		  List<Item> list = categoria.todosItens();
		  
	  }
	  
}
