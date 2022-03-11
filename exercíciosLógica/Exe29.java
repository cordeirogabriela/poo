package exerciciosLogica;

import java.util.Scanner;

public class Exe28 {
	public void run() {
		int a, b, c;
		
		System.out.println("A        B         C     AorBorC");
		
		for(a = 0; a <= 1; a++){
			for(b = 0; b <= 1; b++){
				for(c = 0; c <= 1; c++){
					System.out.println((a==1) + "	"	+ (b==1) + "	"	+ (c==1) + " 	" + (a==1 || b==1 || c==1));
				}
			}
		}	
	}

}
