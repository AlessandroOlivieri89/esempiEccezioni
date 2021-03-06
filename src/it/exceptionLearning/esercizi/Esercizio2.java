package it.exceptionLearning.esercizi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Esercizio2 {

	/* ho inserito il throws IOException (che � classe-padre di FileNotFoundException) 
	 * perch� il metodo RandomAccessFile prevede questa eccezione
	 */
	public static void cat(File file) throws IOException {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        input = new RandomAccessFile(file, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	       
	    /* ho creato questo blocco catch per gestire il FileNotFoundException 
	     * e farmi stampare l'errore
	     */
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} finally {
	        if (input != null) {
	            input.close();
	        }
	    }
	}
}
