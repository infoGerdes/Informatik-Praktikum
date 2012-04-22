package de.fh_muenster.h3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.fh_muenster.h3.Inhaber;
import de.fh_muenster.h3.Konto;

public class TestKonto {

	@Test
	public void testNeuesKontoAnlegen_KontonummerANDInhaber() {
		Konto konto = new Konto(0, new Inhaber("Emanuel", "Schulze Pršbsting",
				"Schmale Stra§e 22, 48149 MŸnster"));

		assertEquals("Der Vorname des Inhabers ist falsch", "Emanuel", konto
				.getInhaber().getVorname());
		assertEquals("der Nachname des Inhabers ist falsch",
				"Schulze Pršbsting", konto.getInhaber().getNachname());
		assertEquals("Die Adresse des Inhabers ist falsch",
				"Schmale Stra§e 22, 48149 MŸnster", konto.getInhaber()
						.getAdresse());
	}

}
