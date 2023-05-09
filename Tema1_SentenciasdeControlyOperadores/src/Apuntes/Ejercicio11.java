package Apuntes;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc= new Scanner(System.in);
		
		
		do {
			System.out.println("Dame una nota entre 0 y 10:");
			num= sc.nextInt();
			switch (num) {
			
			case 0: case 1: case 2: case 3: case 4:
				System.out.println("Insuficiente");
				break;
			case 5: 
				System.out.println("Suficiente");
				break;
			case 6: 
				System.out.println("Bien");
				break;
			case 7: case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matrícula");
				break;			default:
				System.err.println("Valor fuera del intervalo.");
				
			
			}
		} while (num>=0 && num<=10);
		
		
		System.out.println("FIN DEL PROGRAMA");
		
	sc.close();
	
		
	}

}
