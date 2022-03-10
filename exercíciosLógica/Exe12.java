package exerciciosLogica;

import java.util.Scanner;

public class Exe12 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o número de copos que deseja comprar");
		int numCopos = input.nextInt();
		float total; 
		
		if(numCopos <= 100) {
			total = (float) (numCopos * 0.05);
			System.out.println("Valor compra R$" + total);
		}else {
			if(numCopos >= 101 && numCopos <= 500) {
				total = (float) (numCopos * 0.04);
				System.out.println("Valor compra R$" + total);
			}else {
				total = (float) (numCopos * 0.035);
				System.out.println("Valor compra R$" + total);
			}
		}

	}

}
