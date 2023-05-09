package Colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementaciones {

	public static void main(String[] args) {

		//1º implementación de Set (sin orden)
		Set<Integer> s1=new HashSet<Integer>();
		
		s1.add(25);
		s1.add(37);
		s1.add(41);
		s1.add(25);
				
		//For each. También conocido como bucle for
		for(int i:s1) {
			System.out.print(i+" ");
			System.out.println();
		}
		System.out.println(s1);
		
		//2º implementación de Set (con orden)
		TreeSet<String> tr1=new TreeSet<String>();
		
		tr1.add("altair");
		tr1.add("Hola");
		tr1.add("hola3");
		tr1.add("holaa");
		tr1.add("hola");
		
		for(String j:tr1) {
			System.out.print(j+" ");
			System.out.println();
		}
		System.out.println(tr1);

		//3º implementación de Set (según el orden de inserción)
		LinkedHashSet<Double> lh1=new LinkedHashSet<Double>();
		
		lh1.add(3.2);
		lh1.add(-5.0);
		lh1.add(-89.0);
		lh1.add(3.3);
		
		for(Double k:lh1) {
			System.out.print(k+" ");
			System.out.println();
		}
		System.out.println(lh1);
	}

}