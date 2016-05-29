package tests;


import org.junit.Before;
import org.junit.Test;

import singleton_facade.Magazin;

public class MagazinTest {

	Magazin magazin;

	@Before
	public void setUpMagazin() {
		magazin = Magazin.getInstance();
		magazin.incarcaProduse();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testProdusNegativ() {
		magazin.produs(-5).afiseazaDetalii();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testProdusNuExista() {
		magazin.produs(30).afiseazaDetalii();
	}

	@Test
	public void testProdusValid() {
		magazin.produs(2).afiseazaDetalii();
	}
}
