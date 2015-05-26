package Domain;

import java.util.ArrayList;

import Application.Kontrollant;

public class Kursportal {
	
	ArrayList<Kursplats> kursplatser = new ArrayList<Kursplats>();
	
	
	public Kursportal() {

	}
	
	//Skapar kursobjekt med parametrar och lägger till i listan med kursplatser för kursportalen
	//Skapa kursplats - IAD Systemstart steg 3
	public void skapaKursplats(String namn, String kursid) {
		
		
		Kursplats kurs1 = new Kursplats(namn, kursid);
			
		kursplatser.add(kurs1);
	}

	public ArrayList<Kursplats> getKursplatser() {
		return kursplatser;
	}
	
	public Kursplats getKursplats(String kursid) {
		
		for (Kursplats kursplats : kursplatser) {
			if (kursplats.getKursid().equals(kursid)) {
				return kursplats;
			}
		}
		return null;
	}
	
	
	
	

}
