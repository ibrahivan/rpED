package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListImplementaciones {

	public static void main(String[] args) {
		
		//1º implementación de List (la más usada y la que tiene mejor rendimiento)
		
		List<Integer> al1=new ArrayList<Integer>();
		
		al1.add(7);
		al1.add(10);
		al1.add(7);
		al1.add(10);
		
		Iterator<Integer>it1 = al1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println(al1);
			
		
		
		//2º implementación de List (permite que mejore el rendimiento en ciertas ocasiones).
		//Cada elemento apunta al anterior y al siguiente (lista doblemente enlazada)
		
		List<Double> ll1 = new LinkedList<Double>();
		
		ll1.add(null);
		ll1.add(null);
		ll1.add(3.98);
		ll1.add(-3.4);
		
		Iterator<Double> it2 = ll1.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println(ll1);
	}

}
