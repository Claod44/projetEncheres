package org.projetEncheres.EXCEPTIONS;

public class DALException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6962235791238027671L;

	//Constructeurs
	public DALException() {
		super();
	}
	
	public DALException(String message) {
		super(message);
	}
	
	public DALException(String message, Throwable exception) {
		super(message, exception);
	}

	//Méthodes
	@Override
	public String getMessage() {
		StringBuffer sb = new StringBuffer("Couche DAL - ");
		sb.append(super.getMessage());
		
		return sb.toString() ;
	}
	
	
}
