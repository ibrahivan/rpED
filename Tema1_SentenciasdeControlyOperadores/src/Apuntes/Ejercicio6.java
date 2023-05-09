package Apuntes;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Introduce un número para calcular su factorial: ");
		Scanner sc = new Scanner(System.in) ;
		int numero=sc.nextInt(); 	//habria q usar long pq los numeros grande no funcionan
		
		int factorial=1;
		
		if (numero==0)
			factorial=1;
		else {
			
		}
		for(int i=1; i<=numero; i++) {
			factorial=factorial*i;
		}
		
		System.out.print(numero+"!= "+factorial);

		sc.close();
}
	
}
