package Apuntes;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CALCURADORA
		String letra;
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Introduce un letra de las dadas para poner el modo de operacion que "
				+ "quieres de la calculadora:");
		letra=scan.next();
		int a;
		int b;
		Scanner sa = new Scanner(System.in) ;
		Scanner sb = new Scanner(System.in) ;
		
		
		if(letra.equals("S")||letra.equals("R")||letra.equals("M")||letra.equals("D")||letra.equals("C")) {
			System.out.print("Introduce un valor: ");
			a=sa.nextInt();
			System.out.print("Introduce otro valor: ");
			b=sb.nextInt();
		
			switch (letra) {
			
			case "S":
				System.out.println("---SUMA--- ");			
				System.out.print(a+ " + "+b+" = "+ (a+b));
			
				break;
			case "R":
				System.out.println("---RESTA--- ");		
				System.out.print(a+ " - "+b+" = "+ (a-b));
				break;
			case "M":
				System.out.println("---MULTIPLICACIÓN---");
			
				System.out.print(a+ " * "+b+"= "+ (a*b));
				break;
			case "D":
				System.out.println("---DIVISIÓN---");			
				System.out.print(a+ " / "+b+" = "+ (a/b));
				break;
			case "C":
				System.out.println("---RESTO---");
			
				System.out.print(a+ " % "+b+" = "+ (a%b));
				break;
		
					
		}
		
		}
		else if (letra.equals("F"))
			System.out.println("FIN DEL PROGRAMA");
		else 
		{
			System.err.println("**Error, el dato introducido no corresponde con ninguna operación de "
					+ "la calculador**");
			System.out.print("FIN DEL PROGRAMA");}
		
	sa.close();
	sb.close();
	scan.close();

	}

}
