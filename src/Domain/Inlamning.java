package Domain;

import java.io.File;
import java.util.Date;

public class Inlamning {
	
	String date;
	String file;
	String inlamningsid;
	Betyg betyg;
	
	public Inlamning(String date, String file, String inlamningsid) {
		
		this.date = date;
		this.file = file;
		this.inlamningsid = inlamningsid;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getInlamningsid() {
		return inlamningsid;
	}
	public void setInlamningsid(String inlämningsid) {
		this.inlamningsid = inlämningsid;
	}

	public Betyg getBetyg() {
		return betyg;
	}

	public void setBetyg(Betyg betyg) {
		this.betyg = betyg;
	}
	
	
	
	
}
