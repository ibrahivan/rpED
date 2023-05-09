package Apuntes;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num ;
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("Introduce un número para saber si es par o impar: ");
		num=scan.nextInt();
		
		while (num!=0)
		{
			
			if (num%2==0)
				System.out.println("Número par");
			else 
				System.out.println("Número impar");
			
			System.out.print("Introduce un número para saber si es par o impar: ");
			num=scan.nextInt();
		}
		System.out.println("FIN DEL EJERCICIO");
		
		scan.close();
	}

}
