package Colecciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero ; Scanner sc = new Scanner(System.in) ;
		int cont = 0;
		int[]b=new int[10];
		while (cont<b.length) {
			b[cont]=(int)(Math.random()*20+1);
			
			cont ++;
		}
		
		System.out.println("Introduce un numero entre el 1 y el 20 para saber si has acertado: ");
		numero =sc.nextInt();
		
		boolean existe = false;
		for (int i = 0; i < b.length; i++) {
		if (b[i]==numero){
			System.out.println("Enhorabuena. Has acertado");
            existe = true; 
            break;
            }
		}
		
		if (existe==false) {
			System.out.print("Has perdido. Los datos eran: " );
			for (int k=0 ; k<b.length;k++)
				System.out.print(" "+b[k]);  //mostrast numers
			}
		
		sc.close();
			
			
				
		
		
		
	}

}
