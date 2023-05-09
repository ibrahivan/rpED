package Ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class MainCont extends Contador {
	public MainCont(int maximo, int contador) {
		super(maximo, contador);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vueltas;
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantas vueltas desea que realice el contador: ");
		vueltas=sc.nextInt();
		Contador cont = new Contador(20, 0);
		for (int i = 0; i < vueltas; i++) {
			cont.Incrementar();
		}	
	}

}
