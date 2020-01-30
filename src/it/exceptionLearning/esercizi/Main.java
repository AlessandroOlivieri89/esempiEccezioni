package it.exceptionLearning.esercizi;

public class Main {

	public static void main(String[] args) {
		

		int[] T = null;
		
		
		try {
			T[0] = 7;
		}
		catch (NullPointerException npe) {
			npe.printStackTrace();
			
		}
		
	}

}
