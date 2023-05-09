package Apuntes;

import java.util.Scanner;

public class Ejercicio5 {

 public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int numero;
	System.out.println("Introduce un numero del 0 al 10:");
	Scanner sc= new Scanner(System.in);
	numero= sc.nextInt();
	switch (numero)
	{
	case 0:
		System.out.println("El numero introducido es el 0");
		break;
	case 1:
		System.out.println("El numero introducido es el uno");
		break;
	case 2:
		System.out.println("El numero introducido es el dos");
		break;
	case 3:
		System.out.println("El numero introducido es el tres");
		break;
	case 4:
		System.out.println("El numero introducido es el cuatro");
		break;
	case 5:
		System.out.println("El numero introducido es el cinco");
		break;
	case 6:
		System.out.println("El numero introducido es el seis");
		break;
	case 7:
		System.out.println("El numero introducido es el siete");
		break;
	case 8:
		System.out.println("El numero introducido es el ocho");
		break;
	case 9:
		System.out.println("El numero introducido es el nueve");
		break;
	
	default:
		System.err.println("El numero introducido no es correcto");
		break;
 }
	
	sc.close();
 }
 
	
}
		
	