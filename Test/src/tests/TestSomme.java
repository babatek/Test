package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import somme.Sommable;
import somme.Somme;

public class TestSomme {

	@Test
	public void testAdditionne() {
		Sommable s = new Somme();
		assertTrue(s.additionne(3, 2)==5);
	}

}
