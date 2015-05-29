package Domain;

import java.util.ArrayList;

public class Grupp {
	String gruppid;
	ArrayList<Inlamning> inlamningar = new ArrayList<Inlamning>();
	
	public Grupp (String gruppid) {
		
		this.gruppid = gruppid;
	}



public Inlamning getInlamning(String inlamningid) {
	
	for (Inlamning inlamning : inlamningar) {
		if (inlamning.getInlamningsid().equals(inlamningid)) {
			return inlamning;
		}
	}
	return null;
}

public String createID() {
	String id = null;
	
	if (inlamningar.size() == 0) {
		id = "INL";
	} else if (inlamningar.size() == 1) {
		id = "KOMPL1";
	} else if (inlamningar.size() == 2) {
		id = "KOMPL2";
	} else if (inlamningar.size() == 3) {
		id = "KOMPL3";
	}
	
	return id;
}
//IAD steg 1-7: Steg 7
public void skapaInlamning(String fil) {

	Inlamning inlamning = new Inlamning(fil, createID());
	inlamningar.add(inlamning);
	
}



public String getGruppid() {
	return gruppid;
}



public void setGruppid(String gruppid) {
	this.gruppid = gruppid;
}



public ArrayList<Inlamning> getInlamningar() {
	return inlamningar;
}



public void setInlamningar(ArrayList<Inlamning> inlamningar) {
	this.inlamningar = inlamningar;
}

//IAD steg 1-7: Steg 6
public void storeFile(String fil) {
	skapaInlamning(fil);
}



public void examineraUppgift(String inlamningid, String betyg, String betygskala) {
	getInlamning(inlamningid).examineraUppgift(betyg, betygskala);
	
}



public String hamtaUppgift(String inlamningid) {
	String file = getInlamning(inlamningid).getFile();
	return file;
}



}

