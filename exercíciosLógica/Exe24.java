package exerciciosLogica;

import java.util.Scanner;

public class Exe24 {
	public void run() {
		Scanner input = new Scanner(System.in);
		int i = 0;
		System.out.println("Informe um número (1-20) para obter a tabuada");
		int num = input.nextInt();
		if(num <0 || num > 20) {
			System.out.println("Valor fornecido inválido.");
			System.exit(1); 
		}
		System.out.println("Informe qual lógica gostaria que fosse utilizada: 1-While, 2-Do-While, 3-For");
		int opt = input.nextInt();

		switch(opt) {
		case 1:{
			while (i <= 10) {
				System.out.println(num + " x " + i + " = " + (num *i) );
				i ++;
			}
		}break;
		case 2: {
			do {
				System.out.println(num + " x " + i + " = " + (num *i) );
				i++;
			}while(i <=10);
		}break;
		case 3:{
			for(i =0; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num *i) );
			}
		}break;
		}
		
		
	}

}
