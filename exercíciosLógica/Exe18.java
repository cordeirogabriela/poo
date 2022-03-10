//Escreva um programa que leia um número inteiro entre 0 e 100 e o exiba por extenso, por exemplos: 16 -> "dezesseis",
//34 -> "trinta e quatro", etc.. 

package exerciciosLogica;

import java.util.Scanner;

public class Exe18 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um numero entre 0 - 100: ");
		int num = input.nextInt();
		
		if(num < 0 || num >= 100) {
			System.out.println("Número inválido");
		}
		
        String extenso = "";
        String[] unidade,dezena,teens;
        
        unidade = new String[10];
        teens = new String[10];
        dezena = new String[10];
        
        
        unidade[0] = "";
        unidade[1] = "um";
        unidade[2] = "dois";
        unidade[3] = "três";
        unidade[4] = "quatro";
        unidade[5] = "cinco";
        unidade[6] = "seis";
        unidade[7] = "sete";
        unidade[8] = "oito";
        unidade[9] = "nove";
        
            
        teens[0] = "dez";
        teens[1] = "onze";
        teens[2] = "doze";
        teens[3] = "treze";
        teens[4] = "quatorze";
        teens[5] = "quinze";
        teens[6] = "dezesseis";
        teens[7] = "dezessete";
        teens[8] = "dezoito";
        teens[9] = "dezenove";
        
        dezena[0] = "";
        dezena[1] = "dez";
        dezena[2] = "vinte";
        dezena[3] = "trinta";
        dezena[4] = "quarenta";
        dezena[5] = "cinquenta";
        dezena[6] = "sessenta";
        dezena[7] = "setenta";
        dezena[8] = "oitenta";
        dezena[9] = "noventa";
        
        int uni,dez;
        
       
		if (num >= 1 && num <= 99)
        {
             dez = num / 10;
             uni = num % 10;
        
             String add = "";
             if (dez > 0 && uni> 0)
             {
                  add = " e ";
             }
             
             if (num >= 10 && num <= 19)
             {
                  extenso = teens[ uni ];
             }
             else
             {
                  extenso = dezena[ dez] + add + unidade[ uni ];
             }
        }
        System.out.println(extenso);
	}

}
