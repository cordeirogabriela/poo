package exerciciosLogica;
import java.util.Scanner;


public class Exe5 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um n?mero inteiro: ");
		int num = input.nextInt();
		
		if(num % 2 ==  0) {
			System.out.println("N?mero par");
		}else {
			System.out.println("N?mero ?mpar");
		}
	}
}
