package Apuntes;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		Scanner scan = new Scanner(System.in) ;
		
		do {
			System.out.print("Introduce un número para saber si es positivo o negativo: ");
			num=scan.nextInt();
			if (num>0)
				System.out.println("Número postivo");
			else if (num<0)
				System.out.println("Número negativo");

		}while(num!=0);
		
		System.out.println("FIN DEL EJERCICIO");
			
		scan.close();
	}

}
