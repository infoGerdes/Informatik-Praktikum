package de.fh_muenster.h3;

import de.fh_muenster.h3.exceptions.NoMoneyException;

/**
 * @author Emanuel Schulze Pr�bsting
 * 
 *         Kontoklasse.
 * 
 *         Klasse, welche ein Bankkonto repr�sentiert.
 * 
 */
public class Konto {

	/**
	 * Betrag, welcher dem Freund �berwiesen wird, wenn ein Freund geworben
	 * wird.
	 */
	private final int FREUDSCHAFTSWERBUNG = 50;

	/**
	 * Kontonummer des Kontos
	 */
	@SuppressWarnings("unused")
	private int kontonummer;
	/**
	 * Inhaber des Kontos
	 */
	private Inhaber inhaber;
	/**
	 * Kontostand des Kontos
	 */
	private int kontostand;

	/**
	 * @param kontonummer
	 *            Kontonummer des neuen Kontos
	 * @param inhaber
	 *            Inhaber des neuen Kontos
	 */
	public Konto(int kontonummer, Inhaber inhaber) {
		this.kontonummer = kontonummer;
		this.inhaber = inhaber;
	}

	/**
	 * Achtung, es wird {@link Konto#Konto(int, Inhaber)} verwendet, um die
	 * ersten beiden Parameter zu initialisieren.
	 * 
	 * @param kontonummer
	 *            Kontonummer des neuen Kontos
	 * @param inhaber
	 *            Inhaber des neuen kontos
	 * @param betrag
	 *            Betrag, mit dem das Konto initialisiert werden soll.
	 */
	public Konto(int kontonummer, Inhaber inhaber, int betrag) {
		this(kontonummer, inhaber);
		this.kontostand = betrag;
	}

	/**
	 * Konstruktor bei dem ein Betrag ({@link Konto#FREUDSCHAFTSWERBUNG}) auf
	 * das angegebene Fremdkonto �berwiesen wird
	 * 
	 * @param fremdkonto
	 *            Das Konto, auf das der Betrag (
	 *            {@link Konto#FREUDSCHAFTSWERBUNG}) �berwiesen werden soll
	 */
	public Konto(Konto fremdkonto) {
		fremdkonto.einzahlen(FREUDSCHAFTSWERBUNG);
	}

	/**
	 * Erh�ht den Kontostand um den angegebenen Betrag
	 * 
	 * @param betrag
	 *            Betrag, welcher eingezahlt werden soll
	 */
	public void einzahlen(int betrag) {
		kontostand += betrag;
	}

	/**
	 * Reduziert den Kontostand des Kontos um den angegebenen Betrag
	 * 
	 * @param betrag
	 *            Der Betrag, der abgehoben werden soll
	 * @return Der abgehobene Betrag wird zur�ckgegeben
	 * @throws NoMoneyException
	 *             Diese Fehlermeldung wird geworfen, wenn weniger Geld auf dem
	 *             Konto ist, als angefordert wurde.
	 */
	public int abheben(int betrag) throws NoMoneyException {
		if (kontostand < betrag) {
			throw new NoMoneyException(
					"Es ist nicht gen�gend Geld auf ihrem Konto vorhanden");
		}

		kontostand -= betrag;

		return betrag;
	}

	/**
	 * Methode, um Geld von einem Konto auf das andere zu �berweisen
	 * @param empf�nger Emfp�nger der �berweisung
	 * @param betrag Betrag, welcher �berwiesen werden soll
	 * @throws NoMoneyException Diese Fehlermeldung wird geworfen, wenn weniger Geld auf dem
	 *             Konto ist, als angefordert wurde.
	 */
	public void �berweisen(Konto empf�nger, int betrag) throws NoMoneyException {
		this.abheben(betrag);
		empf�nger.einzahlen(betrag);
	}

	/**
	 * @return the inhaber
	 */
	public Inhaber getInhaber() {
		return inhaber;
	}

	/**
	 * @return the kontostand
	 */
	public int getKontostand() {
		return kontostand;
	}

}
