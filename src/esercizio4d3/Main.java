package esercizio4d3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.print("Inserisci un numero per avviare il countdown: ");
		int numero = number.nextInt();
		
		System.out.println("Conto alla rovescia: ");
		System.out.println(Countdown.Capodanno(numero));
	}

}