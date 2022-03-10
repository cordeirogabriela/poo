package exerciciosLogica;

import java.util.Scanner;

public class Exe23 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o capital inicial: ");
		float pv = input.nextFloat();
		System.out.println("Informe a taxa de juros: ");
		float juros = input.nextFloat();
		System.out.println("Informe o total de períodos da aplicação: ");
		int n = input.nextInt();
		
		float fv = (float) (pv * (Math.pow((1 + juros), n)));
		
		System.out.println("Total do capital futuro corresponde a " + fv);
		
	}

}


