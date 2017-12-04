package br.com.xpto.smra.exception;


public class SmraException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3991621869891032904L;
	
	
	public SmraException() {}


	public SmraException( String message, Throwable cause ) {
		super( message, cause );
	}

	public SmraException( String message ) {
		super( message );
	}

}
