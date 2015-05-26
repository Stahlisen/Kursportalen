package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Grupp;

public class GruppTest {

	@Test
	public void test() {
		//Skapar grupp med en parameter
		Grupp grupp = new Grupp("Z");
		
		//Hämtar attribut
		String gruppid = grupp.getGruppid();
		
		//Kontrollerar attribut
		assertEquals("Z", gruppid);
	}

}
