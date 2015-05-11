package Domain;

import java.util.ArrayList;

import Application.Kontrollant;

public class Kursportal {
	
	ArrayList<Kursplats> kursplatser = new ArrayList<Kursplats>();
	
	
	public Kursportal() {

		skapaKursplats("Databaser", "725G51");
		
		
	}
	
	//Skapar kursobjekt med parametrar och lägger till i listan med kursplatser för kursportalen
	
	public void skapaKursplats(String namn, String kursid) {
		
		
		Kursplats kurs1 = new Kursplats(namn, kursid);
		
		System.out.println("Skapar kurs " + namn + " med kursid: " + kursid );
		
		kursplatser.add(kurs1);
	}

	public ArrayList<Kursplats> getKursplatser() {
		return kursplatser;
	}
	
	
	
	

}
