package exerciciosLogica;
import java.util.Scanner;

public class Exe7 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe valor A: ");
		int a = input.nextInt();
		System.out.println("Informe valor B: ");
		int b= input.nextInt();
		
		System.out.println((a == 0) ? " A é igual a zero? V" : "A é igual a zero? F");
		System.out.println((b < 0) ? " B é menor que zero V" : "B é menor que zero");
		System.out.println(((a < 0) || (b < 0)) ? "A OU B são maiores do que zero? V" : "A OU B são maiores do que zero?? F");
		
		
		
	}

}
