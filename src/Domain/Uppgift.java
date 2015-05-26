package Domain;

import java.util.ArrayList;

public class Uppgift {
	String namn;
	String uppgiftsid;
	ArrayList<Grupp> grupplista = new ArrayList<Grupp>();
	
public Uppgift(String namn, String uppgiftsid) {
	this.namn = namn;
	this.uppgiftsid = uppgiftsid;
	
	
}


public Grupp getGrupp(String gruppid) {
	
	for (Grupp grupp : grupplista) {
		if (grupp.getGruppid().equals(gruppid)) {
			return grupp;
		}
	}
	return null;
}




public String getNamn() {
	return namn;
}




public void setNamn(String namn) {
	this.namn = namn;
}




public String getUppgiftsid() {
	return uppgiftsid;
}




public void setUppgiftsid(String uppgiftsid) {
	this.uppgiftsid = uppgiftsid;
}




public ArrayList<Grupp> getGrupplista() {
	return grupplista;
}




public void setGrupplista(ArrayList<Grupp> grupplista) {
	this.grupplista = grupplista;
}





}