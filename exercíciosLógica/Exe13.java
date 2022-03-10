package exerciciosLogica;

import java.util.Scanner;

public class Exe13 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor para verificar se é possível montar um triângulo: ");
		float l1 = input.nextFloat();
		System.out.println("Informe outro valor: ");
		float l2 = input.nextFloat();
		System.out.println("Informe outro valor: ");
		float l3 = input.nextFloat();
		
		if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
			System.out.println("Medidas configuram um triângulo.");
			if(l1 == l2 && l1 == l3) {
				System.out.println("Triângulo equilatero");
			}else {
				if(l1 == l2 || l1 == l3 || l2 == l3) {
					System.out.println("Triângulo isosceles");
			}else {
				System.out.println("Triângulo escaleno");
			}
			
			}	
		}
	}
}

