package Programacao;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double n;
        
        System.out.println("\nDigite um n�mero real.");
        n = s.nextDouble();

        System.out.printf("A ter�a parte �: " + (n / 3));
        
        s.close();
        
        
	}

}
