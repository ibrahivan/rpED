package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayRepaso {

	public static void main(String[] args) {
		
		//Arrays de una dimensión
		int[]num1;
		num1=new int[2];
		num1[0]=11;
		num1[1]=21;
		
		//Bucle for
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		
		int[]num2=new int[4];
		num2[0]=4;
		num2[1]=5;
		num2[2]=4;
		num2[3]=5;
		
		//Bucle while
		int j=0;
		while(j<num2.length) {
			if(num2[j]==4||num2[j]==7)
				System.out.println(num2[j]);
		j++;
		}
		
		int[]num3={2,1,0};
		
		for(int k:num3) {
			System.out.println(k);
		}
		
		
		
		//Arrays multidimensionales
		
		String[][] nombresApellidos = {{"Carlos","Ana","Samuel"},{"Martín","Pérez","Fernández"}};
		
		
		
		//Volcamos la primera fila del array bidimensional en un lista de una dimensión
		
		List<String>listaNombres = new ArrayList<String>();
		for(int l=0;l<nombresApellidos[0].length;l++) {
			listaNombres.add(nombresApellidos[0][l]);
		}
		
		//Imprime por pantalla los nombres de la lista utilizando un iterator
		Iterator<String>it1=listaNombres.iterator();
		
		while(it1.hasNext()) {
			String nombreAux=it1.next();
			if (nombreAux!="Carlos")
				System.out.println(nombreAux);
		}
		
		

	}

}