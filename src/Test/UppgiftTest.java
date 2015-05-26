package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Grupp;
import Domain.Uppgift;

public class UppgiftTest {

	@Test
	public void test() {
		//Skapar uppgiftsobjekt med två parametrar
		Uppgift uppgift=new Uppgift("Laboration1", "L1");
		
		//Hämtar namn och id för objektet
		String id=uppgift.getUppgiftsid();
		String namn=uppgift.getNamn();
		//Kontrollerar attributen
		assertEquals("Laboration1", namn );
		assertEquals("L1", id );
		
		//Skapar grupp och lägger till i grupplista
		Grupp grupp = new Grupp("Z");
		uppgift.getGrupplista().add(grupp);
		
		//Hämtar gruppen med gruppid = Z
		Grupp testgrupp = uppgift.getGrupp("Z");
		
		//Kontrollerar gruppid
		assertEquals("Z", testgrupp.getGruppid());
	
	}

}
