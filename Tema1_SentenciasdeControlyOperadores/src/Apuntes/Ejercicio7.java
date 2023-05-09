package Apuntes;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.println("Introduce un número: ");
		Scanner sc = new Scanner(System.in) ;
		double numero=sc.nextInt(); 	
		System.out.println("Introduce a la potencia que quires calcular: ");
		Scanner scan = new Scanner(System.in) ;
		int exp=scan.nextInt();
		sc.close();
		scan.close();
		
		int potencia=1;
		
		if (numero==1)
			potencia=0;
		if (numero==0)
			potencia=1;
		else {
			for(; exp!=0 ; exp--) {
				potencia=(int) (potencia*numero);
			}
			
		}
		
		System.out.print("La potencia de "+numero+" elevado a "+exp+" es: " +potencia);
		
		
		
			
}

}
	


