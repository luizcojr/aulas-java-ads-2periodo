package Programacao;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String mes;
        double valor, horas, salario;
        
        System.out.println("\nInforme o m�s atual");
        mes = s.nextLine();

        System.out.println("\nInforme seu valor/hora trabalhada.");
        valor = s.nextDouble();
        
        System.out.println("\nInforme o n�mero de horas trabalhadas");
        horas = s.nextDouble();
        
        salario = valor * horas;
        		        
        System.out.println("M�s: " + mes);
        System.out.println("Sal�rio: R$ " + salario);
        
        s.close();
	}

}
