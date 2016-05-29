package tests;
/**
 * 
 */


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import builder.Laptop;
import factory.Produs;
import memento.Client;

public class ClientTest {

	Client client;

	@Before
	public void setUpClient() {
		client = new Client("client@mail.test");

	}

	@Test
	public void getCosCumparaturiTest() {
		assertNotNull("Cos cumparaturi gol", client.getCosCumparaturi());
	}

	@Test
	public void getEmailTest() {
		assertEquals("Nu exista email", "client@mail.test", client.getEmail());
	}

	@Test
	public void undoTest() {
		client.undoAdaugareInCos();
	}

	@Test
	public void redoTest() {
		client.redoAdaugareInCos();
	}

	@Test
	public void verificaCosClient() {
		Produs p1 = new Laptop.LaptopBuilder("Test", "test", 12.0f).build();
		client.adaugaProdusInCos(p1);
		assertEquals("Cosul este gol", false, client.getCosCumparaturi().listaGoala());
	}

	@Test
	public void verificaCosClientGol() {
		assertEquals("Cosul este gol", true, client.getCosCumparaturi().listaGoala());
	}

}
