package exerciciosLogica;

import java.util.Scanner;

public class Exe10 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe num1: ");
		int num1 = input.nextInt();
		System.out.println("Informe num2: ");
		int num2 = input.nextInt();
		System.out.println("Informe num3: ");
		int num3 = input.nextInt();
		
		if((num1 < num2) && (num2 < num3)){
			System.out.println("Ordem crescente:" + num1 + " " + num2 + " " + num3);
		}else {
			if((num1 < num3)&& (num3 < num2)) {
				System.out.println("Ordem crescente:" + num1+ " "  + num3+ " "  + num2);
			}else {
				if((num2 < num1) && (num1 <  num3)) {
					System.out.println("Ordem crescente:" + num2+ " "  + num1+ " "  + num3);
				}else {
					if((num2 < num3) && (num3 < num1)) {
						System.out.println("Ordem crescente:" + num2+ " "  + num3+ " "  + num1);
					}else {
						if((num3 < num1)&& (num1 < num2)) {
							System.out.println("Ordem crescente:" + num3+ " "  + num1+ " "  + num2);
						}else {
							System.out.println("Ordem crescente:" + num3+ " "  + num2+ " "  + num1);
						}
						
					}
					
				}
			}
		}
	}

}