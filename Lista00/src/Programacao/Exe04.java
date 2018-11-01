package Programacao;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int n;
        
        System.out.println("\nDigite um número inteiro.");
        n = s.nextInt();

        System.out.println("Antecessor: " + (n - 1 ));
        System.out.println("Sucessor: " + (n + 1));
        
        s.close();
        
        
	}

}
