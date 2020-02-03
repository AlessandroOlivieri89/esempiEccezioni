package it.exceptionLearning.esercizi;

public class Main {

	public static void main(String[] args) {
		
//      Esercizio 1 eseguito
//		int[] T = null;
//		
//		
//		try {
//			T[0] = 7;
//		}
//		catch (NullPointerException npe) {
//		System.out.println("mancata allocazione");
//		}
//		
		
//		Esercizio 2 eseguito	
//		String s = null;
//		
//		try {
//			int l = s.length();
//		}
//		catch (NullPointerException npe){
//			System.out.println("stringa non inizializzata");
//		}
		
		int i = 0;
		
		try {
			
			
			System.out.println(i/(int) (Math.random() * 4));
		}
		
		catch (ArithmeticException ae) {
			System.out.println("non può essere 0");
		}
	}
	
		
		
	}


