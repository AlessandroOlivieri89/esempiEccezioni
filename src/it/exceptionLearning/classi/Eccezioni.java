package it.exceptionLearning.classi;

public class Eccezioni {
	//metodo main
	public static void main(String[] args) {
		
		//metodo creato da noi eseguito due volte con valori di parametro diversi
		Eccezioni.metodoSequenza1(23);
		Eccezioni.metodoSequenza1(54);
		
	}
	
	
	public static void rilanciaEccezioni1() {
		// esegui un lungo blocco di codice e per un motivo qualsiasi potrebbe verificarsi una eccezione
		
		
	
		throw new RuntimeException("si e' verificata una eccezione");
	
		
	}
	
	
	
	
	public static void metodoSequenza1(int numero) {
		try {
			metodoSequenza2();			
		} catch (Exception e) {
			log ( "Si e' verificato un errrore durante l'esecuzione numero[" + numero + "]");
			e.printStackTrace();
		}
	}


	private static void log(String string) {
		System.out.println(string);
		
//		LOG4J
		
	}


	private static void metodoSequenza2() {
		metodoSequenza3();
	}


	private static void metodoSequenza3() {
	
		int probabilita = (int)( Math.random() * 3 );
		
		if ( probabilita == 1 ) {
			rilanciaEccezioni1();
		}
	}

}
