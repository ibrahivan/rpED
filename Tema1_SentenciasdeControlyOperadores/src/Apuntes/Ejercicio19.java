package Apuntes;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra; 
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		palabra=scan.next();
		
		int cont=1;
		for (int i=0; i<palabra.length(); i++) {
		
			System.out.println("Letra "+cont+": "+ palabra.substring(i, i+1));
			cont++;
			}
		
		scan.close();
		
		

	}

}
