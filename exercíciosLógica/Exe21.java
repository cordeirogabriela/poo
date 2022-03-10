package exerciciosLogica;

import java.util.Scanner;

public class Exe21 {
	public void run() {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe coeficiente a: ");
		float a = input.nextFloat();
		System.out.println("Informe coeficiente b: ");
		float b = input.nextFloat();
		System.out.println("Informe coeficiente c: ");
		float c = input.nextFloat();
		float x1 ;
		float x2 ;
				
		double delta = (Math.pow(b,2) - 4 * a * c);
		
		
		if(delta < 0) {
			System.out.println("Delta = 0. Não há raízes reais.");
		}else {
			if(delta == 0) {
				x1 = -b / (2 * a);
				System.out.println("Delta = " + delta + ". Raízes portanto = " + x1);
			}else {
				x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
				x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
				System.out.println("Delta = " + delta + " Raízes portanto = x'= " + x1 + ", x'' = " + x2);
				
			}
		}
		
		
	}

}
