package Programacao;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String mes;
        double valor, horas, salario;
        
        System.out.println("\nInforme o mês atual");
        mes = s.nextLine();

        System.out.println("\nInforme seu valor/hora trabalhada.");
        valor = s.nextDouble();
        
        System.out.println("\nInforme o número de horas trabalhadas");
        horas = s.nextDouble();
        
        salario = valor * horas;
        		        
        System.out.println("Mês: " + mes);
        System.out.println("Salário: R$ " + salario);
        
        s.close();
	}

}
