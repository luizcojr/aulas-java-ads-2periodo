package Programacao;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String nome;
        
        System.out.println("\nPor favor, digite seu nome.");
        nome = s.nextLine();
        
        System.out.println("Ol�, " + nome + "!");
        
        s.close();
        
	}

}
