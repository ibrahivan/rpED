package Apuntes;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner scan = new Scanner(System.in) ;
		
		
		do {
			System.out.print("Introduzca un número para calcular su cuadrado: ");
			num=scan.nextInt();
			
			if (num<0)
				System.err.println("Valor fuera del intervalo, FIN DEL PROGRAMA");						
			
			else 
				System.out.println("El cuadrado de "+num+ " es "+ num*num +".");
					
			
			
			
			
		}while (num>=0);
		
		
		
		scan.close();
		

	}

}
