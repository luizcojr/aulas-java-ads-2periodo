package Programacao;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double n;
        
        System.out.println("\nDigite um número real.");
        n = s.nextDouble();

        System.out.printf("A terça parte é: " + (n / 3));
        
        s.close();
        
        
	}

}
