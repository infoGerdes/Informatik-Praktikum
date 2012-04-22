package de.fh_muenster.h3.test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;

import de.fh_muenster.h3.Inhaber;
import de.fh_muenster.h3.Konto;
import de.fh_muenster.h3.exceptions.NoMoneyException;

/**
 * @author Emanuel Schulze Pröbsting
 * 
 *         Klasse zum testen der {@link Konto} Klasse
 * 
 */
public class TestKonto {

	/**
	 * Methode zum testen, ob es gelingt, ein neues Konto anzulegen.
	 * 
	 * @throws SecurityException
	 *             Cause: Use of Reflections API
	 * @throws NoSuchFieldException
	 *             Cause: Use of Reflections API
	 * @throws IllegalArgumentException
	 *             Cause: Use of Reflections API
	 * @throws IllegalAccessException
	 *             Cause: Use of Reflections API
	 */
	@Test
	public void testNeuesKontoAnlegen_KontonummerANDInhaber()
			throws SecurityException, NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException {
		Inhaber inhaber = new Inhaber("Emanuel", "Schulze Pröbsting",
				"Schmale Straße 22, 48149 Münster");
		Konto konto = new Konto(99, inhaber);

		Class<?> clazz = konto.getClass();

		Field fieldKontonummer = clazz.getDeclaredField("kontonummer");
		fieldKontonummer.setAccessible(true);

		int kontonummer = fieldKontonummer.getInt(konto);

		assertEquals("Die Kontonummer ist nicht Korrekt", 99, kontonummer);
		assertEquals("Der Kontostand ist nicht Korrekt", 0,
				konto.getKontostand());
		assertEquals("Der Kontoinhaber ist nicht Korrekt", inhaber,
				konto.getInhaber());

	}

	/**
	 * Methode zum testen, ob eine {@link NoMoneyException} geworfen wird, wenn
	 * versucht wird, Geld von einem leeren Konto abzuheben
	 * 
	 * @throws NoMoneyException
	 *             Wird geworfen, wenn nicht genügend Geld auf dem Konto ist
	 */
	@Test(expected = NoMoneyException.class)
	public void negativenBetragAbheben() throws NoMoneyException {
		Konto konto = new Konto(0, new Inhaber(null, null, null));
		konto.abheben(100);
	}

}
