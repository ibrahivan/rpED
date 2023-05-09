package Apuntes;

import java.util.Scanner;

public class Ejercico10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int suma = 0;
		System.out.println("Introduce entero positivo: ");
		Scanner sc= new Scanner(System.in);
		numero= sc.nextInt();
		
		if (numero<=0)
	
			System.err.println("El "+numero+" introducido esta fuera del intervalo, no es mayor que 0");
		else
		{
			for (int i=1; i<=numero; i++) {
				suma+=i;
				}
			System.out.println("La suma de 1+2+3+...+N siendo N el "+numero+" introducido por teclado: "+ suma);
		}
		
	sc.close();
	}

}
