package exerciciosLogica;
import java.util.Scanner;

public class Exe6 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe valor a: ");
		int a = input.nextInt();
		System.out.println("Informe valor b: ");
		int b = input.nextInt();
		
		System.out.println((a > 0) ? "Valor a é maior que zero" : "Valor a é menor que zero");
		System.out.println((b > 0) ? "Valor b é maior que zero" : "Valor b é menor que zero");
		System.out.println((a > 0) && (b > 0) ? "Valor a e b são  maiores que zero" : "Valor a e b são menores que zero");
	}
	

}
