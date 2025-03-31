package thema09.oop4.vererbung.koenigfamilie;

public class QueenElisabeth extends Monarch {
	 
	private String responsibility = "Head of State";
 
	protected int anzahlAutos = 5;
	
	public void displayResponsibilities() {
		System.out.println("Responsibility: " + responsibility);
	}
}