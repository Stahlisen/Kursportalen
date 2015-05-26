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

public void skapaInlamning(String date, String fil, String id) {
	Inlamning inlamning = new Inlamning(date, fil, id);
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



}

