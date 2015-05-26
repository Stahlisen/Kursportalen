package Domain;

import java.util.ArrayList;

public class Moment {
	String momentid;
	String namn;
	ArrayList<Uppgift> uppgifter = new ArrayList<Uppgift>();

	public Moment(String namn1, String momentid1) {
		this.momentid = momentid1;
		this.namn = namn1;

	}

	// Skapa uppgift - IAD Systemstart steg 5
	public void skapaUppgift(String namn, String uppgiftsid) {
		Uppgift uppgift = new Uppgift(namn, uppgiftsid);
		uppgifter.add(uppgift);

	}
	
public Uppgift getUppgift(String uppgiftsid) {
		
		for (Uppgift uppgift : uppgifter) {
			if (uppgift.getUppgiftsid().equals(uppgiftsid)) {
				return uppgift;
			}
		}
		return null;
	}

	public String getMomentid() {
		return momentid;
	}

	public void setMomentid(String momentid) {
		this.momentid = momentid;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public ArrayList<Uppgift> getUppgifter() {
		return uppgifter;
	}

	public void setUppgifter(ArrayList<Uppgift> uppgifter) {
		this.uppgifter = uppgifter;
	}
	
	

}
