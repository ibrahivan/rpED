package Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Apuntes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LISTAS
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(7); //Guarda el siete en el elemto l1
		l1.add(3);
		l1.add(10);
		l1.add(24);
		
		l1.remove(3);
		l1.remove(0); //l1.set(1, -4) cambia el primer indice por -4
		
		
		System.out.println("--Imprime la lista entera--");
		for(int i=0; i<=l1.size(); i++)
		{								//recorreria el for hasta los elementos q hubiese en l1, 
			System.out.println(l1);		//en este caso 3 veces, 4 porque el contador empieza en 0
			}
		System.out.println("--Imprime cada elemento de la lista--");
		int j=0;
		while (j<=l1.size()-1)
		{
			System.out.println(l1.get(j)); //asi imprimira segun el indice (get) que este el numero 
			j++;
		}								 //y va pasando al siguiente indice, 
										//restamos 1 pq no tendria 3 indices sino 2 pq epieza en 0 el indice
		
		System.out.println("--Imprime los elementos en posiciones pares de la lista--");
		
		for (int k=1; k<l1.size(); k+=2) //el contador desde 1 porque el indice 0 lo coge como par
		{
			System.out.println(l1.get(k));
		}
		
		
		System.out.println("---Añadir una lista a otra antes creada---");
		List<Integer> l2= new ArrayList<Integer>();
		l2.add(12);
		l2.add(-9);
		l1.addAll(l2);
		for(int l=0;l<l1.size();l++)
			System.out.print(l1.get(l)+" ");
		
		
		
		//ARRAYS
		double []a= {2.5,2,4};     //Así se inicializa y declara, con valores
		String[]b=new String[4];	  // asi seria con el tamaño, tendria tamaño 4
		b[0]="hola";
		b[1]="mundo";
		// b= {"Hola","mundo"}; NO SE PODRÍA HACER. PARA METER VALORES 
				//EN UN ARRAY CREADO PREVIAMENTE, HAY QUE HACERLO COMO PODEMOS VER 
				//EN LAS DOS LÍNEAS SIGUIENTES
				
				//b[2]="Java"; NO SE PODRÍA HACER PORQUE EL TAMAÑO DEL ARRAY ES 2. A NIVEL DE 
				//COMPILACIÓN BIEN PERO A NIVEL DE EJECUCIÓN PROVOCA UN ERROR
				System.out.println(b[0]+" "+b[1]);
				
		//Bucle for each 
		int []primos= {2,3,5,7};
		
		for(int var:primos)
		{
			System.out.println(var); // cuando acabe el bucle la viarble var ya no existe y deja de ocupar espacio
		}
		
		//ARRAY MULTIDIMENSIONAL
		
		//ARRAY MULTIDIMENSIONAL
				int[][] arrayBidimensional1=new int[3][2];
				arrayBidimensional1[0][0]=10;
				arrayBidimensional1[0][1]=20;
				arrayBidimensional1[1][0]=30;
				arrayBidimensional1[1][1]=40;
				arrayBidimensional1[2][0]=50;
				arrayBidimensional1[2][1]=60;
				
				int[][] arrayBidimensional2= {{3,2,1},{6,5,4}};
				int x=arrayBidimensional2[1][0];
				System.out.println(x);
				
				//Para conocer el tamaño de la fila 1 de un array bidimensional
				int y=arrayBidimensional2[0].length;
				System.out.println(y);
				
				//Para recorrer la fila 1 de un array bidimensional con un for each
				for(int k:arrayBidimensional1[0]) {
					System.out.println(k+" ");
				}
				
				//Para recorrer todo el array bidimensional con dos bucles for each
				for(int[]l:arrayBidimensional2) {
					for(int m:l) {
						System.out.println(m+" ");
					}
				}
				
				//Para recorrer la columna 2 de un array bidimensional
				int col=1;
		        for(int z=0;z<arrayBidimensional2.length;z++) {
		            System.out.println(arrayBidimensional2[z][col]);
		        }
				
				//APARTADO LIST
				List<Integer> l11;
				l11=new ArrayList<Integer>();
				
				//Añadir elementos
				l11.add(7);
				l11.add(3);
				l11.add(10);
				l11.add(24);
				
				//Eliminar elementos
				l11.remove(3);
				l11.remove(0);
				
				
				//Imprime la lista entera, el nº de veces que corresponde al tamaño de la lista
				System.out.println("IMPRIME LA LISTA ENTERA");
				for(int i=0;i<=l11.size();i++) {
					System.out.println(l11);
				}
				
				//Imprime cada elemento de la lista
				int j1=0;
				System.out.println("IMPRIME CADA ELEMENTO DE LA LISTA");
				while(j1<l11.size()) {
					System.out.println(l11.get(j1));
					j1++;
				}
				
				//Imprime los elementos en posición par de una lista
				System.out.println("IMPRIME LOS ELEMENTOS EN POSICIONES PARES DE LA LISTA");
				for(int k=0;k<l11.size();k=k+2) {
					System.out.println(l11.get(k));
				}
				
				//Cambiamos un elemento de la lista
				l11.set(1, -4);
				System.out.println("IMPRIME EL ELEMENTO  CON ÍNDICE 1 DE LA LISTA");
				System.out.println(l11.get(1));
				
				//Añadir una lista a otra lista creada previamente
				List<Integer> l21=new ArrayList<Integer>();
				l21.add(12);
				l21.add(-9);
				
				l11.addAll(l21);
				for(int l=0;l<l11.size();l++) {
					System.out.print(l11.get(l)+" ");
				}
				System.out.println();
				
				//Añadir una lista a otra lista creada previamente 
				//en la posición 1
				l11.addAll(1,l21);
				
				for(int l=0;l<l11.size();l++) {
					System.out.print(l11.get(l)+" ");
				}
				System.out.println();
				
				//System.out.println(l2.get(0)); NO SE PUEDE HACER YA QUE GENERA UN ERROR DE EJECUCIÓN. 
				//NO EXISTE EL ELEMENTO CON ÍNDICE 0
				
				//APARTADO SET
				Set<Integer> s1=new HashSet<Integer>();
				
				//Añadir elementos
				s1.add(3);
				s1.add(9);
				s1.add(6);
				s1.add(2);
				
				//Eliminar elementos
				s1.remove(2);
				s1.remove(9);
				
				//Impresión por pantalla
				System.out.println(s1);
				
				//No se puede modificar su contenido
				//Pero sí puedes añadir un nuevo valorç
				s1.add(100);
				s1.add(100);
				s1.add(100);
				s1.add(101);
				s1.add(102);
				System.out.println(s1);
				
				//Borrar todo el set
				s1.clear();
				System.out.println(s1);
				
				//Vamos a meter una lista dentro de este set
				s1.addAll(l11);
				System.out.println(s1);
				
				//Vamos a comprobar si en el conjunto existe un elemento concreto
				System.out.println(s1.contains(3));
				
				//Vamos a comprobar si el conjunto está vacío
				System.out.println(s1.isEmpty());
				
				//Vamos a comparar s1 con otra colección (lista)
				System.out.println(s1.containsAll(l11));
				
				//Vamos a comparar s1 con otra colección (lista)
				l11.add(80);
				System.out.println(s1.containsAll(l11));
					
		
	}

}
