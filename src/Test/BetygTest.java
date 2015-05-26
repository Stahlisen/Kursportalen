package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Betyg;

public class BetygTest {

	@Test
	public void test() {
		//Skapar betyg med två parametrar
		Betyg testbetyg = new Betyg("G", "Filfak");
		
		//Hämtar attribut
		String betyg = testbetyg.getBetyg();
		String betygskala = testbetyg.getBetygskala();
		
		//Kontrollerar attribut
		assertEquals("G", betyg);
		assertEquals("Filfak", betygskala);
		
	}

}
