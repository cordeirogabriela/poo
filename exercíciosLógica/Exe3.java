package exerciciosLogica;
import java.util.Scanner;

public class Exe3 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor:");
		float valor = input.nextFloat();
		if(valor > 50) {
			System.out.println("O número" + valor + " é maior que 50");
		}else {
			System.out.println("O número" + valor + " não é maior 50");
	
		}
	}
}
