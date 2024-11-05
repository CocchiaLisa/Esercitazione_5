package esercitazione5;

import java.util.Scanner;

public class Es3_while {
	/* Inserire da tastiera una sequenza di numeri, 
	 * finché‚ la loro somma non supera il valore 
	 * 200, e contarli. */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero, somma = 0, conta = 0;
		
		do{
			System.out.println("Inserisci numero: ");
			numero = in.nextInt();
			
			somma += numero;
			conta++;
			
		}while(somma <= 200);
		// Itero se la somma è ancora sotto i 200
		
		System.out.println("La somma è: " + somma);
		System.out.println("Sono stati inseriti " + conta + " numeri.");
		
		in.close();
	}

}
