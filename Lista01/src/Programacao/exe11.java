package Programacao;

import java.util.Scanner;

public class exe11 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int entrada;
        double hora, min, seg;
        
        System.out.println("\nEntre com os segundos: ");
        entrada = s.nextInt();
	
        hora = entrada / 3600;
        min = (entrada % 3600) / 60;
        seg = (entrada % 3600) % 60;
        
        System.out.println(hora + " : " + min + " : " + seg);
        
        s.close();
	}

}
