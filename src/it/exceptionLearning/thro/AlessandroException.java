package it.exceptionLearning.thro;


/**
 * Questa classe l'abbiamo <b>creata</b> per imparare le eccezioni
 * @throws AlessandroException
 * @author Admin
 */

public class AlessandroException extends Exception {

	public AlessandroException() {
		super();
	
	}

	public AlessandroException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public AlessandroException(String string) {
		super(string);
	}

}
