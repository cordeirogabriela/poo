package exerciciosLogica;

import java.util.Scanner;

public class Exe27 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe quantas m�dias ser�o calculadas: ");
		int tot = input.nextInt();
		int i;
		float media = 0;
		int nota;
		int numNotas = 0;
		
		for(i = 0; i < tot; i++) {
			do {
				System.out.println("Informe nota ou qualquer n�mero negativo caso n�o aja mais notas");
				nota = input.nextInt();
				if(nota > 0) {
					media = media + nota;
					numNotas++;
				}
			}while(nota > 0);
			System.out.println(numNotas);
			System.out.println("M�dia do aluno: " + media/numNotas);
			numNotas = 0;
			media = 0;
		}
		System.exit(1);
		
	}

}
