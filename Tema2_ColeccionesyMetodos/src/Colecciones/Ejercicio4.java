package Colecciones;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a=new int[100];
		int num = 0; int sum=0;
		
		for (int i=0; i<a.length;i++)
		{
			a[i]=i+1;
			sum+=i+1;
			System.out.print(a[i]+ " ");
			
			
		}
		System.out.println("\nLa suma de todos los numeros es: "+sum+" y la media es : "+(double)sum/a.length);
	}

}
