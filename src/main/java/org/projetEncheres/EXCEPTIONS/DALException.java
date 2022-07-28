package org.projetEncheres.EXCEPTIONS;

//TODO faire nos propres exceptions pour traiter des erreurs selon nos besoins
/**
 * 
 * @author Claod
 * {@summary Exception personnalisée liée à la DAL}
 * 
 */
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
