package br.com.comex.modelo;

public class ComexException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2934371259103510353L;

	public ComexException() {
		
		super();
		
	}
	
	public ComexException (String msg) {
		
		super(msg);
		
	}
	
}
