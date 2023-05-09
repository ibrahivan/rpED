package Apuntes;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		System.out.println("Introduce un número del 1 al 7 para saber que día de la semana es:");
		Scanner sc= new Scanner(System.in);
		numero= sc.nextInt();
		switch (numero)
		{
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
						
		default:
			System.err.println("** Error número fuera del intervalo **");
			
	 }
		
		sc.close();
	 }
	 
		
		
		
		
		
		
		

	}


