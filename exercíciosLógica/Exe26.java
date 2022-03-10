package exerciciosLogica;

import java.util.Scanner;

import javax.xml.crypto.Data;


public class Exe26 {
	public void run() {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		int num;
		do {
			System.out.println("Informe um número para ser somado, caso deseje terminar digite 0 ");
			num = input.nextInt();
			soma = soma + num;
		}while(num != 0);
		
		System.out.println("Total = " + soma);
	}

}
