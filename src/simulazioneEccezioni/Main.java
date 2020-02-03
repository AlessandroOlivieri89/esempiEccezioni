package simulazioneEccezioni;

import it.exceptionLearning.thro.AlessandroException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String nomeTabella1_1 = "Tabella 1/1";

		String nomeTabella1_2 = "Tabella 1/2";
		String nomeTabella2_2 = "Tabella 2/2";
		
		Main.inserisciInUnaTabella(nomeTabella1_1);
		
		Main.inserisciInDueTabelle(nomeTabella1_2, nomeTabella2_2);
	}

	
	public static void inserisciInUnaTabella ( String nomeTabella ) {
		
		try {
			inserisci( nomeTabella );
		} catch (Exception e) {
			
			String errorMessage = "l'inserimento nella tabella[" + nomeTabella + "] non ha funzionato ";
			
			System.out.println("l'inserimento nella tabella[" + nomeTabella + "] non ha funzionato a causa di [" + e.getMessage() + "]");
			e.printStackTrace();
			
//			logger.error ( errorMessage, e);
		}
		
	}


	/**
	 * Questo metodo simula la Transazione
	 * @throws AlessandroException
	 * @author Admin
	 */
	
	public static void inserisciInDueTabelle (String nomeTabella1, String nomeTabella2) throws AlessandroException {
		try {
			inserisci(nomeTabella1);
			System.out.println("Inserimento completato nella tabella[" + nomeTabella1 + "]");
			
			inserisci(nomeTabella2);
			System.out.println("Inserimento completato nella tabella[" + nomeTabella2 + "]");

			
		} catch (Exception e) {
			String errorMessage = "l'inserimento nelle due tabelle non ha funzionato";
			System.out.println("Impossibile Inserire nelle due tabelle");
			e.printStackTrace();
		}
	}

	
	
	private static void inserisci(String nomeTabella) throws AlessandroException {
		
		int probabilita = (int) (Math.random() * 2);
		
		if (probabilita == 1) {
			throw new RuntimeException("si e' verificata una eccezione nell'inserimento nella tabella[" + nomeTabella +"]");
		}
	}

}
