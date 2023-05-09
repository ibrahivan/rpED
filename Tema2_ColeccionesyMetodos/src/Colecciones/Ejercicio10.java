package Colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		List<Integer> lista=new ArrayList<Integer>();
		lista=rellenarValores(lista,10);
		imprimirValores(lista);
	}
	
	public static List<Integer> rellenarValores(List<Integer> lista, int tamaño) {
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<tamaño;i++) {
			System.out.println("Introduzca el "+(i+1)+"º valor de la lista:");
			lista.add(sc.nextInt());
		}
		sc.close();
		return lista;
	}
	
	public static void imprimirValores(List<Integer>lista) {
		int j=0;
		while(j<lista.size()) {
			System.out.println("Índice: "+j+". Valor: "+lista.get(j));
			j++;
		}
	}
}