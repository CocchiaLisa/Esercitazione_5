package esercitazione5;
import java.util.Scanner;
public class Es4_while {

	/*
	 * Realizzare un programma che permetta all'utente di inserire un numero num 
	 * reale diverso da zero. Successivamente il programma deve permettere all'utente 
	 * di inserire una serie di numeri reali.
	 *  La serie termina quando l'utente inserisce come numero il valore zero.
	 *  Il programma deve mostrare in output quanti valori appartenenti alla serie 
	 *  inserita dall'utente sono uguali al valore num.*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il numero da confrontare: ");
		double num = in.nextDouble();

		double ultimo;
		int conta=0;
		do {
			System.out.println("\nInserisci un numero:");
			ultimo = in.nextDouble();
			
			if(ultimo==num){ // se il numero inserito è uguale, lo conto
				conta++;
			} 
		}while(ultimo != 0);
		System.out.println("i numeri uguali a "+num+" sono "+conta);

		in.close();
	}

}
