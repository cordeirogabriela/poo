package exerciciosLogica;
import java.util.Scanner;


public class Exe5 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int num = input.nextInt();
		
		if(num % 2 ==  0) {
			System.out.println("Número par");
		}else {
			System.out.println("Número ímpar");
		}
	}
}
