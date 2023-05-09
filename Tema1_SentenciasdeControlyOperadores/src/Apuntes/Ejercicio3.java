 package Apuntes;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//lea un carácter por teclado y compruebe si es una letra mayúscula
		
		char a;
		
		System.out.println("Introduzca un carácter por teclado");
		Scanner sc = new Scanner(System.in) ;
		a = sc.nextLine().charAt(0);
		
		if(Character.isUpperCase(a))
		{         
	          System.out.println("La letra "+a+" es mayúscula");             
		}
		else{                  
			System.out.println("La letra "+a+" es minuscula");  
		}
		
		
		System.out.println("Fin ejercicio 3.");
		sc.close();
		
		
	
	}

}
