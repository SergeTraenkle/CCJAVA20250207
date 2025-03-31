package thema02.datentypen.aufgabe2.typoperationen;

import utils.IO;

// 2.1 Variablendeklaration

public class TypOperationProgramm {

	public static void main(String[] args) {
		
		byte m = 100;
		System.out.println("m = " + m);
		
		short n = 20000;
		System.out.println("n = " + n);
		

		int i = 1000000;
//		System.out.println("i = " + i);
		IO.writeln("i = " + i);

		long j = 1000000000000L; // L !!!
		System.out.println("j = " + j);
		
		float k = 3.14f;  
		System.out.println("k = " + k);
		
		double l = 3.1415926535;
		System.out.println("l = " + l);
		

		
		char o = 'A';
		System.out.println("o = " + o);
		
		boolean p = true;
		System.out.println("p = " + p);

	}
}
