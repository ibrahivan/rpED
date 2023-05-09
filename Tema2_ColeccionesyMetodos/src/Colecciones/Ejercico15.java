package Colecciones;

import java.util.Scanner;

public class Ejercico15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de numeros primos que va a introducir: ");
		int tamañoArray = leer.nextInt();
		int []primos=new int [tamañoArray];
	
		
		
		for(int j:primos)
		{
			System.out.println("Introduce un numero primo: ");
			primos[j]= n.nextInt();
			System.out.println("El cuadrado de "+ primos[j]+ " es "+primos[j]*primos[j]);
		}
		System.out.println("---FIN DEL EJERCICIO---");
		
		
		leer.close();
		n.close();
		
	}

}
