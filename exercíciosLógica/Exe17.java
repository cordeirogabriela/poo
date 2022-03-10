package exerciciosLogica;

import java.util.Scanner;

public class Exe17 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a quantidade de segundos");
		int segundos = input.nextInt();
		
		if(segundos < 0) {
			System.out.println("Valor negativo fornecido.");
			System.exit(1); 
		}
		int horas = segundos / 3600;
		int val = segundos % 3600;
		int minutos = val / 60;
		
		if(minutos <= 0) {
			System.out.println("Segundos informado: " + segundos + ". Corresponde a " + horas + " hora(s).");
		}else {
			System.out.println("Segundos informado: " + segundos + ". Corresponde a " + horas + " hora(s)" + " e " + minutos + " minutos.");
		}
	}

}
