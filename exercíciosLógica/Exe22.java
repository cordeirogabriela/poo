package exerciciosLogica;

import java.util.Scanner;

public class Exe22 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe posi??o inicial: ");
		float p0 = input.nextFloat();
		System.out.println("Informe velocidade: ");
		float velocidade = input.nextFloat();
		System.out.println("Informe acelera??o: ");
		float acelera??o = input.nextFloat();
		System.out.println("Informe tempo toal: ");
		int tempo = input.nextInt();
		
		float pf = (float) (p0 + velocidade * tempo + (acelera??o * (Math.pow(tempo,2))) / 2);
		
		System.out.println("Posi??o final ? " + pf);
		
	}

}
