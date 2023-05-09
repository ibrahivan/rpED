package Apuntes;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num ; int adi;
		
		Scanner sadi =new Scanner(System.in);
		num = (int)(Math.random()*100);
		System.out.print("Número generado: "+ num);
		
		
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
		
	
		sadi.close();

	}

}
