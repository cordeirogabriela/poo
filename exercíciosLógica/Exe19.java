//Escreva um programa que leia um número real entre 0.00 e 100.00 e o 
//exiba por extenso como se fosse uma quantia em
//dinheiro, por exemplo: 1.00 -> "um real", .12.73 -> "doze reais e setenta e três centavos". 


package exerciciosLogica;

import java.util.Scanner;

public class Exe19 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o valor real  entre [0,00 - 100,00] ");
		float valor = input.nextFloat();
		        
        String extenso = "";
        
        int num = (int) valor;
        double restante = valor - num;
        String centavos = String.valueOf((int)Math.round(restante * 100));
      
                     
        String[] unidade = {"", "um", "dois", "três", "quatro", "cinco",
                "seis", "sete", "oito", "nove", "dez", "onze",
                "doze", "treze", "quatorze", "quinze", "dezesseis",
                "dezessete", "dezoito", "dezenove"};
                
        String[] teens;
        teens = new String[10];
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
        
        String[] dezena = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
                "sessenta", "setenta", "oitenta", "noventa"};
       
        int uni,dez;
                     
       
		if (num >= 1 && num <= 99)
        {
             dez =  (int) (num / 10);
             uni =  (int) (num % 10);
                     
             String add = "";
             if (dez > 0 && uni> 0)
             {
                  add = " e ";
             }
             
             if (num >= 10 && num <= 19)
             {
                  extenso = teens[ uni ] + "reais";
             }
             else
             {
                  extenso = dezena[ dez]  + add + unidade[ uni ] + " reais";
             }
        }
		
		if (!centavos.equals("0")) { 
			String add = " e ";
			int n = 0;
		       if (extenso.length() != 0) 
		    	   extenso = extenso + add;
		       if (centavos.equals("1"))
		    	   extenso = extenso + "um centavo";
		       else {
		         n = Integer.parseInt(centavos, 10);
		         if (n <= 19)
		        	 extenso = extenso + unidade[n];
		         else {             
		           uni = n % 10;   
		           dez = n / 10;   
		           extenso = extenso + dezena[dez];
		           if (uni != 0)
		        	   extenso = extenso + add + unidade[uni];
		         }
		         extenso = extenso + " centavos";
		       }
		    }
		
		
        System.out.println(extenso);
	}
		
		
}


