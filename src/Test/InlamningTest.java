package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Inlamning;

public class InlamningTest {

	@Test
	public void test() {
		//Skapar inlämningsobjekt med tre parametrar
		Inlamning inlamning = new Inlamning("/Users/fredrikstahl/Desktop", "zi1");
		
		//Hämtar attribut
		String file = inlamning.getFile();
		String id = inlamning.getInlamningsid();
		
		//Kontrollerar attribut
		assertEquals("/Users/fredrikstahl/Desktop", file);
		assertEquals("zi1", id);
		
	}

}
