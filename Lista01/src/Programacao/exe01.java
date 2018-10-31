package Programacao;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("\nPor favor, digite seu nome.");
        nome = s.nextLine();
        
        System.out.println("\nPor favor, digite sua idade.");
        idade = s.nextInt();
  
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        
        s.close();

	}

}
