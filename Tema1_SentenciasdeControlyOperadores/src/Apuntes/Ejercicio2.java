package Apuntes;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lea un número entero y muestre si el número es múltiplo de 10.
		
		int a;
		
		System.out.println("Introduzca un número por teclado");
		Scanner sc = new Scanner(System.in) ;
		a=sc.nextInt();
		
		if (a%10==0)
		{
			System.out.println("El número "+a+" es múltiplo de 10.");
		}
		else
		{
			System.out.println("El número "+a+" NO es múltiplo de 10.");
		}
		
		System.out.println("Fin ejercicio 2.");
		sc.close();	
		
		
		
		
		
		
		
		
		
	}

}
