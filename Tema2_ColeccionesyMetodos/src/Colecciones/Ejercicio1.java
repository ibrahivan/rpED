package Colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1=new ArrayList<Integer>();
		int cont=1; int vueltas; int num;
		Scanner sc = new Scanner(System.in) ;
		Scanner scan = new Scanner(System.in) ;
		System.out.println("¿Cuantos números desea introducir?");
		vueltas=sc.nextInt();
		
		while(vueltas>=cont)
		{
			System.out.println("Introduce un número: ");
			num=scan.nextInt();
			l1.add(num);
			cont++;
		}
		System.out.println("La lista sería: "+ l1);
		sc.close();
		scan.close();
		
	}

}
