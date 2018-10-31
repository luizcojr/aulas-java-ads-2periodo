package Programacao;

import java.util.Scanner;

public class exe07 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double num, metros;
        
        System.out.println("\nInforme o valor em centímetros:");
        num = s.nextDouble();
	
        metros = num / 100;
        
        System.out.println("\nValor em metros: " + metros + " metros");
        
        s.close();
	}

}
