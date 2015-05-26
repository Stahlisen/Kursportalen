/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Kursplats;
import Domain.Kursportal;

/**
 * @author fredrikstahl
 *
 */
public class KursportalTest {

	@Test
	public void test() {
		//Skapar en ny kursplats med två parametrar
		Kursportal kursportal = new Kursportal();
		kursportal.skapaKursplats("Databaser", "725G51");
		
		//Hämtar det första objektet i kurslistan
		Kursplats kursplats = kursportal.getKursplatser().get(0);
		
		//Kontrollerar attributer
		assertEquals("Databaser", kursplats.getNamn());
		assertEquals("725G51", kursplats.getKursid());

	}

}
