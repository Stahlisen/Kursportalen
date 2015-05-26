package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Moment;
import Domain.Uppgift;

public class MomentTest {

	@Test
	public void test() {
		//Skapar moment med två parametrar
		Moment moment = new Moment("Labbar", "L1");
	
		//Hämtar attribut
		String namn = moment.getNamn();
		String id = moment.getMomentid();
		
		//Kontrollerar attribut
		assertEquals("Labbar", namn);
		assertEquals("L1", id);
		
		//Skapar uppgift
		moment.skapaUppgift("Laboration 1", "LAB1");
		
		//Hämtar objektet ur uppgiftslistan
		Uppgift uppgift = moment.getUppgifter().get(0);
		
		//Kontrollerar attribut
		assertEquals("Laboration 1", uppgift.getNamn());
		assertEquals("LAB1", uppgift.getUppgiftsid());
	
	}

}
