package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Kursplats;
import Domain.Moment;

public class KursplatsTest {

	@Test
	public void test() {
		//Skapar ett kursplatsobjekt med två parametrar
		Kursplats kursplats = new Kursplats("Databaser", "725G51");
		
		//Hämtar namn och kursid för objektet
		String namn = kursplats.getNamn();
		String id = kursplats.getKursid();
		
		//Kontrollerar attributer
		assertEquals("Databaser", namn);
		assertEquals("725G51", id);
		
		//Anropar skapaMoment för att skapa ett moment och lägga in i momentlistan
		kursplats.skapaMoment("Laborationer", "L1");
		
		//Hämtar momentobjektet
		Moment moment = kursplats.getMomentlista().get(0);
		
		//Kontrollerar attributer
		assertEquals("Laborationer", moment.getNamn());
		assertEquals("L1", moment.getMomentid());
		
	}

}
