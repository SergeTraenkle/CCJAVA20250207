package thema12.oop9.datenstrukturen.comparable.loesung1;

public class Student {
	private int matrikelNummer;
	private String vorname;
	private String nachname;
	private String email;
	private String handyNummer;
	private String festnetzNummer;
	
	public Student(int matrikelNummer, String vorname, String nachname, String email) {
		this.matrikelNummer = matrikelNummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
	}

	public int getMatrikelNummer() {
		return matrikelNummer;
	}

	public void setMatrikelNummer(int matrikelNummer) {
		this.matrikelNummer = matrikelNummer;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHandyNummer() {
		return handyNummer;
	}

	public void setHandyNummer(String handyNummer) {
		this.handyNummer = handyNummer;
	}

	public String getFestnetzNummer() {
		return festnetzNummer;
	}

	public void setFestnetzNummer(String festnetzNummer) {
		this.festnetzNummer = festnetzNummer;
	}


	
	

}
