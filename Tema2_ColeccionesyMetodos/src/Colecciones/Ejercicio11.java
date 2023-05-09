package Colecciones;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Scanner scan=new Scanner (System.in);
		String []a= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		int ndia;
		String dia;
		
		do {
		System.out.print("¿Qué día es? ");
		dia=sc.next();
		ndia = CapturaDia(dia);
		System.out.println("¿Cuantos quiere avanzar?");
		int avanzar = sc.nextInt();
		int ultdia = (ndia+avanzar)%7;
		System.out.println("El día será "+a[ultdia]);
		
		
		
		}while(dia.equals("fin"));
	
		
		sc.close();
		scan.close();
		
	}
	public static int CapturaDia (String a) {
		String a1="";
		int n = 0;
		switch (a1) {
		
		case "Lunes":case "lunes":
			 n=0;
			break;
		case "Martes":case "martes":
			 n=1;
			break;
		case "Miercoles":case "miercoles":
			 n=2;
			break;
		case "Jueves":case "jueves":
			 n=3;
			break;
		case "Viernes":case "viernes":
			 n=4;
			break;
		case "Sabado":case "sabado":
			 n=5;
			break;
		case "Domingo":case "domingo":
			 n=6;
			break;
		case "Fin":case "fin":
			
			break;
			
		
		
		
		
		}
		return n;
		
	}

}
