package exerciciosLogica;

import java.util.Scanner;

public class Exe14 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a primeira nota");
		float n1 = input.nextFloat();
		System.out.println("Informe a segunda nota");
		float n2 = input.nextFloat();
		System.out.println("Informe a terceira nota");
		float n3 = input.nextFloat();

		float media = (n1+n2+n3) / 3;
		
		if(media >= 7) {
			System.out.println("Média " + media + ": Aprovado.");
		}else {
			if(media < 3) {
				System.out.println("Média " + media + ": Reprovado.");
			}else {
				System.out.println("Média " + media + ": Exame.");
			}
		}
	}

}
