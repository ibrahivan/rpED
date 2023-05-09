package introduccion;

import java.util.Scanner;

public class Utilidades {
	 public static void main(String[] args) {
	    	
	
	String saludo="Hola mundo";
	
	
	
	 System.out.println(saludo);
	 
		//Ejercicio 2
		
		int numero1= 60;
		int numero2=50;
		
		System.out.println(numero1+numero2);
		
		boolean numeroMayor1=numero1>numero2;
		System.out.println(numeroMayor1);
		
		int multiplicacion=numero1*numero2;
				System.out.println(multiplicacion);
				
		double decimal1=2.5, decimal2=5.9;
		System.out.println(decimal1*decimal2);
		
		
		//Ejercico 3
		String miNombre;
		int numeroLectura1;
		int numeroLectura2;
		boolean comparacion;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("¿Cuál es tu nombre?: ");
		miNombre=sc.next();
		System.out.println(miNombre);
		
		System.out.println("Dame un numero: ");
		numeroLectura1=sc.nextInt();
		System.out.println("Dame otro numero: ");
		numeroLectura2=sc.nextInt();
		
		int suma= numeroLectura1+numeroLectura2;
		System.out.println("Suma de los dos numeros= " + suma);
		
		comparacion= numeroLectura1>numeroLectura2;
		System.out.println("El primer numero es mayor que el segundo numero: " + comparacion);
		System.out.println("Hasta luego " + miNombre);
		
		
		
	 
	 }

}
