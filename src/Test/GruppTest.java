package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Grupp;
import Domain.Inlamning;

public class GruppTest {

	@Test
	public void test() {
		//Skapar grupp med en parameter
		Grupp grupp = new Grupp("Z");
		
		//Hämtar attribut
		String gruppid = grupp.getGruppid();
		
		//Kontrollerar attribut
		assertEquals("Z", gruppid);
		
		grupp.skapaInlamning("exfil");
		grupp.skapaInlamning("exfil");
		
		String newid = grupp.createID();
		
		assertEquals("KOMPL2", newid);
		
	}

}
