package exerciciosLogica;
import java.util.Scanner;

public class Exe6 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe valor a: ");
		int a = input.nextInt();
		System.out.println("Informe valor b: ");
		int b = input.nextInt();
		
		System.out.println((a > 0) ? "Valor a � maior que zero" : "Valor a � menor que zero");
		System.out.println((b > 0) ? "Valor b � maior que zero" : "Valor b � menor que zero");
		System.out.println((a > 0) && (b > 0) ? "Valor a e b s�o  maiores que zero" : "Valor a e b s�o menores que zero");
	}
	

}
