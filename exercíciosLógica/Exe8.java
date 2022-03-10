package exerciciosLogica;
import java.util.Scanner;

public class Exe8 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe num 1");
		int num1 = input.nextInt();
		System.out.println("Informe num 2");
		int num2 = input.nextInt();
		System.out.println("Informe num 3");
		int num3 = input.nextInt();
		
		if((num1 > num2) && (num1 > num3)){
			System.out.println("Valor" + num1 + "é maior que todos");
		}else {
			if((num2 > num1) && (num2 > num3)) {
				System.out.println("Valor" + num2 + "é maior que todos");
			}else {
				System.out.println("Valor" + num3 + "é maior que todos");
			}
		}
		
	}

}
