package Programacao;

import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double saldo, poupanca;
        
        System.out.println("\nInforme o saldo de sua poupan�a:");
        saldo = s.nextDouble();
	
        poupanca = saldo + saldo * 0.03;
        
        System.out.println("Poupan�a com reajuste = R$ " + poupanca);
        
        s.close();
	}

}



