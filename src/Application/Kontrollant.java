package Application;

import java.util.ArrayList;

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
		hämtaKurs();
		
	}
	
	public void hämtaKurs() {
		System.out.println(kursportal.getKursplatser().get(0).getNamn());
		
		
	}
	
}
