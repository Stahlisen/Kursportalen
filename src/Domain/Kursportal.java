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
	
	//IAD steg 1-7: Steg 2
	public void storeFile(String kursid, String momentid, String uppgiftsid, String gruppid, String fil) {
		
		getKursplats(kursid).storeFile(momentid, uppgiftsid, gruppid, fil);
	}

	public void examineraUppgift(String kursid, String momentid,
			String uppgiftsid, String gruppid, String inlamningid, String betyg, String betygskala) {
		
		getKursplats(kursid).examineraUppgift(momentid, uppgiftsid, gruppid, inlamningid, betyg, betygskala);
		
	}

	public String hamtaUppgift(String kursid, String momentid,
			String uppgiftsid, String gruppid, String inlamningid) {
		String file = getKursplats(kursid).hamtaUppgift(momentid, uppgiftsid, gruppid, inlamningid);
				
			
		return file;
	}
	
	

}
