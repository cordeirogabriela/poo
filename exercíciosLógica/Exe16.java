package exerciciosLogica;

import java.util.Scanner;

public class Exe16{
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a base");
		float base = input.nextFloat();
		System.out.println("Informe a altura");
		float altura = input.nextFloat();
		
		float area = (base * altura) / 2;
		
		System.out.println("Area do triângulo: " + area);
	}

}
