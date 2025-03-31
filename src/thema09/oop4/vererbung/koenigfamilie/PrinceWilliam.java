package thema09.oop4.vererbung.koenigfamilie;

public class PrinceWilliam extends PrinceCharles {
	 
	private int generationNumber = 4;
	
	public void displayGeneration() {
		System.out.println("Generation: " + generationNumber);
	}
}

