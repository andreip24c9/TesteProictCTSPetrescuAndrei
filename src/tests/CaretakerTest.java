package tests;


import org.junit.Before;
import org.junit.Test;

import memento.Caretaker;

public class CaretakerTest {

	Caretaker caretakerTest;

	@Before
	public void setUp() {
		caretakerTest = new Caretaker();

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void getMementoTest() {
		caretakerTest.getMemento(-1);
	}

}
