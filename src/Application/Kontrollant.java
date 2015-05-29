package Application;

import java.util.ArrayList;

import Domain.Betyg;
import Domain.Kursportal;
import GUI.Vy;


public class Kontrollant {
	private String userid;
	private Vy vy;
	private Kursportal kursportal;

	public Kontrollant(String uid) {
		
		userid = uid;
		vy = new Vy(this);
		
		//Skapa kontrollant - IAD Systemstart steg 2
		kursportal = new Kursportal();
	}
	
	//IAD steg 1-7: Steg 1
	public void storeFile(String kursid, String momentid, String uppgiftsid, String gruppid, String fil) {
		kursportal.storeFile(kursid, momentid, uppgiftsid, gruppid, fil);
	}
	
	
	//IAD steg 8-11, 13-14
	public void examineraUppgift(String kursid, String momentid, String uppgiftsid, String gruppid, String inlamningid, String betyg, String betygskala) {

		kursportal.examineraUppgift(kursid, momentid, uppgiftsid, gruppid, inlamningid, betyg, betygskala);
	}
	
	//IAD steg 8-12
	public String hamtaUppgift(String kursid, String momentid, String uppgiftsid, String inlamningid, String gruppid) {
		String file = kursportal.hamtaUppgift(kursid, momentid, uppgiftsid, gruppid, inlamningid);
		
		String file = kursportal.getKursplats(kursid).getMoment(momentid).getUppgift(uppgiftsid).getGrupp(gruppid).getInlamning(inlamningid).getFile();
		return file;
	}
	
}
