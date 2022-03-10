package exerciciosLogica;

import java.util.Scanner;

public class Exe11 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um numero inteiro: ");
		int n1 = input.nextInt();
		System.out.println("Informe outro numero inteiro: ");
		int n2 = input.nextInt();
		
		if( (n1 % n2) == 0) {
			System.out.println(n1 + " é múltiplo de " + n2);
		}else {
			System.out.println(n1 + " não é múltiplo de " + n2);
		}
		
		if( (n2 % n1) == 0) {
			System.out.println(n2 + " é múltiplo de " + n1);
		}else {
			System.out.println(n2 + " não é múltiplo de " + n1);
		}
		
		
	}
	

}
