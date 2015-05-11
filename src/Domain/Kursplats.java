package Domain;

import java.util.ArrayList;

public class Kursplats {
ArrayList deltagarlista = new ArrayList();
String namn;
String kursid;
ArrayList<Moment> momentlista = new <Moment>ArrayList();

public Kursplats(String knamn, String kid) {
	
	namn = knamn;
	kursid = kid;
	
	skapaMoment("Labbar", "L1");
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

public void skapaMoment(String namn, String momentid) {
	
	Moment moment1 = new Moment(namn, momentid);
	System.out.println("Skapar moment " + namn + " med momentid: " + momentid );
	
	
	momentlista.add(moment1);
}

	
}
