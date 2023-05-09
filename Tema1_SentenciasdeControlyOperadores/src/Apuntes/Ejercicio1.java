package Apuntes;

import java.util.Scanner;

public class Ejercicio1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Lea un número entero por teclado y calcule si es par o impar. 
		
	int a;
	System.out.println("Escribe un número: ");
	Scanner sc= new Scanner(System.in);
	a= sc.nextInt();
	
	if (a%2==0)
	{
		System.out.println("El número " + a +" es par.");
	}
	else
	{
		System.out.println("El número "+a+" es impar.");
	}
		System.out.println("Fin ejercicio 1.");
		sc.close();		
	}

}
