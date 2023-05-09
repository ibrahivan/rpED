package Apuntes;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num ; int adi;
		Scanner scan = new Scanner(System.in) ;
		Scanner sadi =new Scanner(System.in);
		System.out.print("Introduce un número: ");
		num=scan.nextInt();
		System.out.println("\n\n\n\n\n");
		do 
		{
			System.out.print("\nIntroduce un número para adivinar el principal: ");
			adi=sadi.nextInt();
			if (adi<num)
				System.out.println("El numero introducido es menor que el principal.");
			else if (adi>num)
				System.out.println("El numero introducido es mayor que el principal.");
			
		}while (adi!=num);
		
		System.out.println("¡Enhorabuenaa, acertastee!");
		
		scan.close();
		sadi.close();
		

	}

}
