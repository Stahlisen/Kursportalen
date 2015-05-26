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
	
	//Iad steg 1-7
	public void storeFile(String kursid, String momentid, String uppgiftsid, String gruppid, String fil) {
		
		String date = "2015-05-26";
		String id = "inl1";
		kursportal.getKursplats(kursid).getMoment(momentid).getUppgift(uppgiftsid).getGrupp(gruppid).skapaInlamning(date, fil, id);
	}
	
	//IAD steg 8-11, 13-14
	public void examineraUppgift(String kursid, String momentid, String uppgiftsid, String gruppid, String inlamningid, String betyg, String betygskala) {
		
		Betyg betyget = new Betyg(betyg, betygskala);
		kursportal.getKursplats(kursid).getMoment(momentid).getUppgift(uppgiftsid).getGrupp(gruppid).getInlamning(inlamningid).setBetyg(betyget);
	}
	
	//IAD steg 8-12
	public String hamtaUppgift(String kursid, String momentid, String uppgiftsid, String inlamningid, String gruppid) {
		
		String file = kursportal.getKursplats(kursid).getMoment(momentid).getUppgift(uppgiftsid).getGrupp(gruppid).getInlamning(inlamningid).getFile();
		return file;
	}
	
}
