package de.fh_muenster.h3;

public class Inhaber {
	public String vorname;
	public String nachname;
	public String adresse;

	public Inhaber(String vorname, String nachname, String adresse) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
	}

	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * @param vorname
	 *            the vorname to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @param nachname
	 *            the nachname to set
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}