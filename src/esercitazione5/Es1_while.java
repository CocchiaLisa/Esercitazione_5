package esercitazione5;

import java.util.Scanner;

public class Es1_while {
	/*
	 * Leggere una sequenza di numeri. 
	 * Terminare la lettura quando si incontra un numero dispari e stampare 
	 * quanti numeri sono stati letti e quanti fra essi sono risultati diversi da zero. */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num, conta = 0, conta_non_zero = 0;
		
		System.out.println("Inserire una sequenza di numeri, la serie termina quando viene inserito un numero dispati");
		
		do {
			System.out.println("Inserisci un numero: ");
			num = in.nextInt();
			
			conta++; // conto il numero inserito
			
			if(num != 0) {	// se il numero è diverso da 0 lo conto
				conta_non_zero++;
			}
		}while(num % 2 == 0); 
		// la condizione permette di iterare finchè il numero inserito è pari
		
		
		System.out.println("Sono stati inseriti " + conta + " numeri");
		System.out.println("Di cui " + conta_non_zero + " diversi da zero");
		
		in.close();
	}

}
