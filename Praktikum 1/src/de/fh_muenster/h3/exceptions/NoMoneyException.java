package de.fh_muenster.h3.exceptions;

public class NoMoneyException extends Exception {

	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = -2884108849268733805L;

	public NoMoneyException() {
		super();
	}
	
	public NoMoneyException(String message) {
		super(message);
	}
	
	public NoMoneyException(Throwable e) {
		super(e);
	}
}
