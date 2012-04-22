package de.fh_muenster.h3;

import de.fh_muenster.h3.exceptions.NoMoneyException;

public class Konto {

	private final int FREUDSCHAFTSWERBUNG = 60;

	private int kontonummer;
	private Inhaber inhaber;

	/**
	 * @return the kontonummer
	 */
	public int getKontonummer() {
		return kontonummer;
	}

	/**
	 * @param kontonummer
	 *            the kontonummer to set
	 */
	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	/**
	 * @param inhaber
	 *            the inhaber to set
	 */
	public void setInhaber(Inhaber inhaber) {
		this.inhaber = inhaber;
	}

	/**
	 * @param kontostand
	 *            the kontostand to set
	 */
	public void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}

	private int kontostand;

	public Konto(int kontonummer, Inhaber inhaber) {
		this.kontonummer = kontonummer;
		this.inhaber = inhaber;
	}

	public Konto(int kontonummer, Inhaber inhaber, int betrag) {
		this(kontonummer, inhaber);
		this.kontostand += betrag;
	}

	public Konto(Konto fremdkonto) {
		fremdkonto.einzahlen(FREUDSCHAFTSWERBUNG);
	}

	public void einzahlen(int betrag) {
		kontostand += betrag;
	}

	public int abheben(int betrag) throws NoMoneyException {
		if (kontostand < betrag) {
			throw new NoMoneyException(
					"Es ist nicht genŸgend Geld auf ihrem Konto vorhanden");
		}

		kontostand -= betrag;

		return betrag;
	}

	public void Ÿberweisen(Konto empfŠnger, int betrag) throws NoMoneyException {
		this.abheben(betrag);
		empfŠnger.einzahlen(betrag);
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
