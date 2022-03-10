package exerciciosLogica;

import java.util.Scanner;

public class Exe22 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe posição inicial: ");
		float p0 = input.nextFloat();
		System.out.println("Informe velocidade: ");
		float velocidade = input.nextFloat();
		System.out.println("Informe aceleração: ");
		float aceleração = input.nextFloat();
		System.out.println("Informe tempo toal: ");
		int tempo = input.nextInt();
		
		float pf = (float) (p0 + velocidade * tempo + (aceleração * (Math.pow(tempo,2))) / 2);
		
		System.out.println("Posição final é " + pf);
		
	}

}
