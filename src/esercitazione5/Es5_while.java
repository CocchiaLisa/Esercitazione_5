package esercitazione5;
import java.util.Scanner;
public class Es5_while {
	
	final static float PESO_STANDARD = 500f;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float tolleranza = 0.05f;
		float lim_inf, lim_sup, peso, errore;
		lim_inf = PESO_STANDARD - PESO_STANDARD * tolleranza;
		lim_sup = PESO_STANDARD + PESO_STANDARD * tolleranza;
		
		int pacchettiFuoriNorma = 0, num_pacchetti = 0;
		
		do {
			System.out.println("inserisci il peso del prossimo pacchetto:");
			peso = in.nextInt();
			if(peso > lim_sup || peso < lim_inf) {
				pacchettiFuoriNorma++;
			}
			num_pacchetti++;
		}while(pacchettiFuoriNorma < 5);
		
		errore = (float)pacchettiFuoriNorma / (float)num_pacchetti * 100f;
		System.out.println(pacchettiFuoriNorma);
		System.out.println(num_pacchetti);
		System.out.println("La percentuale di errore è: " + errore + "%");
	
		in.close();
	}
}