package Programacao;

import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double Num, Quadrado;
        
        System.out.println("\nInforme o número:");
        Num = s.nextInt();
	
        Quadrado = Math.pow(Num, 2);
        
        System.out.println("Valor ao Quadrado = " + Quadrado);
        
        s.close();
	}

}
