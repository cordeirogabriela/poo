package exerciciosLogica;

import java.time.Year;
import java.util.Scanner;

public class Exe30 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("y = f(x) = a * x + b");
		System.out.println("Informe coeficiente a:");
		int a = input.nextInt();
		System.out.println("Informe coeficiente b:");
		int b = input.nextInt();
		System.out.println("Informe o valor do intervalo para realização da função. Limite inferior: ");
		int inf = input.nextInt();
		System.out.println("Limite superior:");
		int sup = input.nextInt();
		
		int[] vetAux;
		vetAux = new int[(sup-inf)+1];
		
		int y;
		int j=0;
		int tamVet=0;
		
		for(int i = inf; i <= sup; i++) {
			y = (a * i) + b;
			vetAux[j] = y;
			tamVet++;
			j++;
			
		}
		
	
		System.out.println("X	|	Y");
		for(j =0; j < tamVet ; j++) {
			
			System.out.println(inf +"	|	"+ vetAux[j]);
			inf++;
		}
		

	}

}
