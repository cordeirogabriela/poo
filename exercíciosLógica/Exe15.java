package exerciciosLogica;

import java.util.Scanner;

public class Exe15 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe x");
		int x = input.nextInt();
		System.out.println("Informe y");
		int y = input.nextInt();
		
		System.out.println("Soma = " + (x+y));
		System.out.println("Produto = " + (x*y));
		
		if(x > y) {
			System.out.println("X > Y");
		}else {
			if(x == y) {
				System.out.println("X = Y");
			}else {
				System.out.println("X < Y");
			}
		}
		
		
	}
}