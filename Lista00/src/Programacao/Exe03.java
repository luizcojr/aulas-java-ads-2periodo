package Programacao;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("\nPor favor, digite o primeiro número inteiro.");
        n1 = s.nextInt();

        System.out.println("\nAgora, digite o segundo número inteiro.");
        n2 = s.nextInt();
        
        System.out.println("Números digitados: " + n1 + " e " + n2);
        
        s.close();
	}

}
