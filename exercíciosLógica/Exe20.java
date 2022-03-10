package exerciciosLogica;

import java.util.Scanner;

public class Exe20 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a medida em metros: ");
		float metros = input.nextFloat();
		
		if(metros < 0) {
			System.out.println("Valor negativo fornecido.");
			System.exit(1); 
		}
		
		double pes = metros * 3.315;
		System.out.println("Metro informado: " + metros + ". Corresponde a " + pes + " pés.");
		
	}

}
