package exerciciosLogica;

import java.util.Scanner;

public class Exe13 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor para verificar se � poss�vel montar um tri�ngulo: ");
		float l1 = input.nextFloat();
		System.out.println("Informe outro valor: ");
		float l2 = input.nextFloat();
		System.out.println("Informe outro valor: ");
		float l3 = input.nextFloat();
		
		if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
			System.out.println("Medidas configuram um tri�ngulo.");
			if(l1 == l2 && l1 == l3) {
				System.out.println("Tri�ngulo equilatero");
			}else {
				if(l1 == l2 || l1 == l3 || l2 == l3) {
					System.out.println("Tri�ngulo isosceles");
			}else {
				System.out.println("Tri�ngulo escaleno");
			}
			
			}	
		}
	}
}

