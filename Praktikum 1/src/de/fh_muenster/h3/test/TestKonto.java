package de.fh_muenster.h3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.fh_muenster.h3.Inhaber;
import de.fh_muenster.h3.Konto;

public class TestKonto {

	@Test
	public void testNeuesKontoAnlegen_KontonummerANDInhaber() {
		Konto konto = new Konto(0, new Inhaber("Emanuel", "Schulze Pr�bsting",
				"Schmale Stra�e 22, 48149 M�nster"));

		assertEquals("Der Vorname des Inhabers ist falsch", "Emanuel", konto
				.getInhaber().getVorname());
		assertEquals("der Nachname des Inhabers ist falsch",
				"Schulze Pr�bsting", konto.getInhaber().getNachname());
		assertEquals("Die Adresse des Inhabers ist falsch",
				"Schmale Stra�e 22, 48149 M�nster", konto.getInhaber()
						.getAdresse());
	}

}
