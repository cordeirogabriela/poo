package exerciciosLogica;

import java.util.Scanner;


public class Exe25 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o total de numeros que ser?o somados: ");
		int tot = input.nextInt();
		int num[];
		int soma=0;
		num = new int[tot];
		
		for(int i = 0; i < tot; i++) {
			System.out.println("N?mero a ser somado");
			 num[i] = input.nextInt();
			 soma= soma + num[i];
		}	
		System.out.println("soma = " + soma);

	}

}
