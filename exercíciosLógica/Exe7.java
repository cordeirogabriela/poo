package exerciciosLogica;
import java.util.Scanner;

public class Exe7 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe valor A: ");
		int a = input.nextInt();
		System.out.println("Informe valor B: ");
		int b= input.nextInt();
		
		System.out.println((a == 0) ? " A � igual a zero? V" : "A � igual a zero? F");
		System.out.println((b < 0) ? " B � menor que zero V" : "B � menor que zero");
		System.out.println(((a < 0) || (b < 0)) ? "A OU B s�o maiores do que zero? V" : "A OU B s�o maiores do que zero?? F");
		
		
		
	}

}
