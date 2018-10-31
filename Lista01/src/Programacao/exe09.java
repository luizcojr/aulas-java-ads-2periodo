package Programacao;

import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int num1, num2;
        double num3, prod, soma, cubo;
        
        System.out.println("\nInforme o primeiro número inteiro:");
        num1 = s.nextInt();
        
        System.out.println("\nInforme o segundo número inteiro:");
        num2 = s.nextInt();
        
        System.out.println("\nInforme um número real:");
        num3 = s.nextDouble();
	
        prod = (Math.pow(num1, 2)) * (num2 / 2);
        System.out.println("Produto: " + prod);
        
        soma = num1 * 3 + num3;
        System.out.println("Soma: " + soma);

        cubo = Math.pow(num3, 3);
        System.out.println("Cubo: " + cubo);
        
        s.close();
	}

}
