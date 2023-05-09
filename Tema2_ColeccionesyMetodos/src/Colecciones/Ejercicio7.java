package Colecciones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("Elige el tamaño del array");
		int tamañoArray = leer.nextInt();
		int [] a1 = new int[tamañoArray];
		
		
		a1=NumerosAleatorios(0,9,a1);
		
		PresentarArray(a1);
		
		SumarArray(a1);
		
		leer.close();
		
	}

	public static int[] NumerosAleatorios(int min, int max, int[]array) {
		int n ;
		int contador=0;
		while(contador<array.length) {
			n= (int) (Math.random() * (max+1 - min) + min);
			array[contador]=n;
			contador++;
		}
		return array;
	}
	public static void PresentarArray(int[] array) {
		int contador=0;
		while (contador<array.length) {
			System.out.println((contador+1)+ ". " +array[contador]+"  ");
			contador++;
		}
	}
	public static void SumarArray(int[]array) {
		int suma=0;
		for(int i=0;i<array.length;i++) {
			suma=suma+array[i];
		}
		System.out.println("La suma de los numeros es "+suma);
		
		
	}

}
