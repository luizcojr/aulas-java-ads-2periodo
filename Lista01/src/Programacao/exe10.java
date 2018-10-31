package Programacao;

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double altura, peso;
        
        System.out.println("\nInforme sua altura:");
        altura = s.nextDouble();
	
        peso = 72.7 * altura - 58;
        
        System.out.println("\nSeu peso ideal: " + peso + " kg");
        
        s.close();
	}

}
