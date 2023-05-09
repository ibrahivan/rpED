package Colecciones;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array: ");
				
		int[]numeros=new int[sc.nextInt()];
		numeros=creaArray(100,numeros);
		
		imprimeArray(numeros);
		System.out.println("El mayor valor del array es "+mayorValorArray(numeros));
		sc.close();
	}
	
	public static int[] creaArray(int b, int[] numeros) {
		int num;
		int contador=0;
		while(contador<numeros.length) {
			num=(int)(Math.random()*b+1);
			if(esPrimo(num)) {
				numeros[contador]=num;
				contador++;
			}
		}
		return numeros;
	}
	
	public static void imprimeArray(int[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}
	
	public static int mayorValorArray(int[] numeros) {
	 	int max=0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>max)
				max=numeros[i];
		}
		return max;
	}
	
	public static boolean esPrimo(int num) {
	    boolean esPrimo=true;	    
	    if (num==0||num==1||num==2) {
	        return false;
	    }  
	    for(int i=2;i<num;i++) {
	        if (num%i==0) {
	            return false;
	        }
	    }
	    return esPrimo;
	}
}