package thema01.grundlagen.helloworld;

import java.util.Scanner;

public class ScannerProgramm {
 
	public static void main(String[] args) {
 
		System.out.println("What is your name? ");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Ihr Name ist: " + name);
		
		
		scanner.close();
	}
 
}
 