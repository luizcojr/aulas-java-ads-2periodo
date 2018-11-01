package Programacao;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String nome, endereco, telefone;
        
        System.out.println("\nPor favor, digite seu nome.");
        nome = s.nextLine();
        
        System.out.println("\nPor favor, digite seu endereço.");
        endereco = s.nextLine();
        
        System.out.println("\nPor favor, digite seu telefone.");
        telefone = s.nextLine();
        
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        
        s.close();

	}

}
