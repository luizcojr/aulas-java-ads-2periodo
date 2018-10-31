package Programacao;

import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double Num, grauCelsius;
        
        System.out.println("\nInforme o valor da temperatura em ºF:");
        Num = s.nextInt();
	
        grauCelsius = 5 * ((Num-32) / 9);
        
        System.out.println("\nTemperatura em Celsius: " + grauCelsius + " ºC");
        
        s.close();
	}

}
