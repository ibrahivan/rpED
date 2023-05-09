package Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio12 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]num = new int [10];
		List<Integer> lista=new ArrayList<Integer>();
		
		for(int i = 1; i<10; i++) {
		    num[i]=(int)(Math.random()*(35-20+1)+20);
		    if (num[i]>=25) 
		    	lista.add(num[i]);		    		    		
		}
		System.out.println(lista);
	}

}
