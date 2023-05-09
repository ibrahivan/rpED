package Apuntes;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		System.out.println("Introduce un número del 1 al 12 para saber que mes es:");
		Scanner sc= new Scanner(System.in);
		numero= sc.nextInt();
		switch (numero)
		{
		case 1:
			System.out.println("Enero, tiene 31 días");
			break;
		case 2:
			System.out.println("Febrero.");
			int anio;
			System.out.println("\nIntroduce un año para saber es bisiesto: ");
			Scanner scbi= new Scanner(System.in);
			anio= scbi.nextInt();
				if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) 
					System.out.println("Sí es bisiesto, tiene 29 días.");
				else 
				System.out.println("No es bisiesto, tiene 28 días.");
			break;
		case 3:
			System.out.println("Marzo, tiene 31 días.");
			break;
		case 4:
			System.out.println("Abril, tiene 30 días.");
			break;
		case 5:
			System.out.println("Mayo, tiene 31 días.");
			break;
		case 6:
			System.out.println("Junio, tiene 30 días.");
			break;
		case 7:
			System.out.println("Julio, tiene 31 días.");
			break;
		case 8:
			System.out.println("Agosto, tiene 31 días.");
			break;
		case 9:
			System.out.println("Septiembre, tiene 30 días.");
			break;
		case 10:
			System.out.println("Octubre, tiene 31 días.");
			break;
		case 11:
			System.out.println("Noviembvre, tiene 30 días.");
			break;
		case 12:
			System.out.println("Diciembre, tiene 31 días.");
			break;
		default:
			System.err.println("** Error número fuera del intervalo **");
			
	 }
		
		sc.close();
	 }
	 		
	}


