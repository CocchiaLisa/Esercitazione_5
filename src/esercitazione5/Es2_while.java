package esercitazione5;

import java.util.Scanner;

public class Es2_while {
	/*
	 * Sequenza controllata
		Realizzare un programma che permetta di eseguire 
		un “input controllato” in modo che vengano 
		accettati soltanto numeri compresi tra 1 e 50.
			●  	Se il numero non è compreso nell’intervallo 
				visualizzare “input errato”
			●   Altrimenti andare avanti nell’esecuzione
		
		La richiesta termina quando	l’utente inserisce 0.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		do{
			System.out.println("Inserisci un numero: ");
			numero = in.nextInt();
			if(numero >= 1 && numero <= 50) {
				System.out.println("Numero accettato");
			}
			else {
				System.out.println("Input errato");
			}
		}while(numero != 0);
		
		in.close();
	}

}
