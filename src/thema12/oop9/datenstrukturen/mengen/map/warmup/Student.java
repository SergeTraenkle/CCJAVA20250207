package thema12.oop9.datenstrukturen.mengen.map.warmup;

public class Student implements Comparable<Student>{

	private int age;
	private int matrikelNummer;
	private String vorname;
	private String nachname;
	private String email;
	
	public Student(int matrikelNummer, String vorname, String nachname, String email) {
		this.matrikelNummer = matrikelNummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public int compareTo(Student other) {
		// return Integer.compare(this.age, other.age);
		if(this.age < other.age) {
			return -1;
		}
		else if (this.age > other.age) {
			return 1;
		}
		else (this.age == other.age) {
			return age ;
		}
	}
}
