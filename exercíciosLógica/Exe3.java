package exerciciosLogica;
import java.util.Scanner;

public class Exe3 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um valor:");
		float valor = input.nextFloat();
		if(valor > 50) {
			System.out.println("O n?mero" + valor + " ? maior que 50");
		}else {
			System.out.println("O n?mero" + valor + " n?o ? maior 50");
	
		}
	}
}
