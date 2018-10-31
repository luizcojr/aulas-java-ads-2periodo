package Programacao;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int divisor, dividendo, quociente, resto;
        
        System.out.println("\nInforme o divisor.");
        divisor = s.nextInt();

        System.out.println("\nInforme o dividendo.");
        dividendo = s.nextInt();
        
        quociente = dividendo / divisor;
        		
        resto = dividendo % divisor;
        
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
        
        s.close();
	}

}
