package Programacao;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("\nPor favor, digite o primeiro n�mero inteiro.");
        n1 = s.nextInt();

        System.out.println("\nAgora, digite o segundo n�mero inteiro.");
        n2 = s.nextInt();
        
        System.out.println("SOMA � igual a: " + (n1 + n2));
        
        s.close();

	}

}
