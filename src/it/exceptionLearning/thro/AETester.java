package it.exceptionLearning.thro;

import it.exceptionLearning.esercizi.ListOfNumbers;

public class AETester {

	
	
	public static void main(String[] args) {
		
		ListOfNumbers LoN = new ListOfNumbers();
		LoN.readList();
	}
	
	
	public static void generaEccezione () throws AlessandroException {
		
		throw new AlessandroException("si e' verificata un'eccezione");
	}

}
