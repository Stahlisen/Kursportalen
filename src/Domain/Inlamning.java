package Domain;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Inlamning {
	
	String date;
	String file;
	String inlamningsid;
	Betyg betyg;
	
	public Inlamning(String file, String inlamningsid) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date_ = new Date();
		this.date = dateFormat.format(date_);
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

	public void examineraUppgift(String betyg2, String betygskala) {
		betyg = new Betyg(betyg2, betygskala);
		
	}
	
	
	
	
}
