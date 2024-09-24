package co.edu.unbosque.util.exception;

import co.edu.unbosque.view.ViewFacade;

public class TimeNotValidException extends Exception{
	
	public TimeNotValidException() {
		super("Ingrese una hora válida");
	}
}
