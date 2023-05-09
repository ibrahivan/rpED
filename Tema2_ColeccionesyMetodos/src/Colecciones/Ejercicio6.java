package Colecciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

		String frase; Scanner sc = new Scanner(System.in) ;
		
		
		System.out.println("Introduce un frase que quieras guardar: ");
		frase=sc.next();
		char[] frasechar ;
		frasechar=frase.toCharArray();
		
		int i=0;
		while (i<frasechar.length) {
			System.out.print(frasechar[i]);
			i++;
		}
		
		sc.close();
		
	}

}
