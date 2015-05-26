package Domain;

import java.util.ArrayList;

public class Kursplats {
ArrayList deltagarlista = new ArrayList();
String namn;
String kursid;
ArrayList<Moment> momentlista = new ArrayList<Moment>();

public Kursplats(String knamn, String kid) {
	
	namn = knamn;
	kursid = kid;
	
	

}

public String getNamn() {
	return namn;
}

public void setNamn(String namn) {
	this.namn = namn;
}

public String getKursid() {
	return kursid;
}

public void setKursid(String kursid) {
	this.kursid = kursid;
}

//Skapa moment - IAD Systemstart steg 4
public void skapaMoment(String namn, String momentid) {
	
	Moment moment1 = new Moment(namn, momentid);	
	
	momentlista.add(moment1);
}

public ArrayList<Moment> getMomentlista() {
	return momentlista;
}

public void setMomentlista(ArrayList<Moment> momentlista) {
	this.momentlista = momentlista;
}

public Moment getMoment(String momentid) {
	
	for (Moment moment : momentlista) {
		if (moment.getMomentid().equals(momentid)) {
			return moment;
		}
	}
	return null;
}



	
}
