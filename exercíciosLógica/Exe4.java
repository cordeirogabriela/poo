package exerciciosLogica;
import java.util.Scanner;

public class Exe4 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor:");
		float valor = input.nextFloat();
		if(valor > 100) {
			System.out.println("O n�mero" + valor + " � maior que 100");
		}else {
			System.out.println("O n�mero" + valor + " � menor ou igual a 100");
	
		}
	}
}