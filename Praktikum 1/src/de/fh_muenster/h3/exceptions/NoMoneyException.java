package de.fh_muenster.h3.exceptions;

/**
 * @author Emanuel Schulze Pršbsting
 * 
 *         Fehler, welcher geworfen wird, wenn weniger Geld auf dem Konto ist,
 *         als angefordert wurde.
 * 
 */
public class NoMoneyException extends Exception {

	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = -2884108849268733805L;

	/**
	 * Defaultkonstrukor
	 */
	public NoMoneyException() {
		super();
	}

	/**
	 * 
	 * @param message Nachricht, die im StackTrace angezeigt werden soll.
	 */
	public NoMoneyException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param e Fehler, welcher mit an den StackTrace angehangen werden soll.
	 */
	public NoMoneyException(Throwable e) {
		super(e);
	}
}
