package Programacao;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double n1, n2, media;
        
        System.out.println("\nDigite primeiro n�mero real.");
        n1 = s.nextDouble();
        
        System.out.println("\nDigite segundo n�mero real.");
        n2 = s.nextDouble();
        
        media = (n1+n2)/2;
 
        System.out.printf("M�dia: " + media);
        
        s.close();
        

	}

}
