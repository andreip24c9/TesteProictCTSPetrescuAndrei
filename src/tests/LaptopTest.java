package tests;


import org.junit.Before;
import org.junit.Test;

import builder.Builder;
import factory.LaptopFactory;
import factory.Produs;

public class LaptopTest {

	Produs laptopTest;
	Builder buliderTest;

	@Before
	public void setUpBuilder() {
		buliderTest = new LaptopFactory().creazaProdus("test", "test", 1.0f);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testBluetooth() {
		laptopTest = buliderTest.addBluetooth().build();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testWifi() {
		laptopTest = buliderTest.addWiFi().build();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testDiagonala() {
		laptopTest = buliderTest.setDigonala(12).build();
	}

	@Test
	public void testProcesor() {
		laptopTest = buliderTest.setProcesor("intel i7").build();
	}

}
