package Apuntes;

public class Ejercicio4 {
	public static void main(String[] args) {

	int cont=0;
	
	
	for (int i=10; i<=70; i++) {
		if (i%3==0) 
			cont++;
		}
	System.out.println("Entre el 10 y el 70 hay "+cont+" numeros multiplos de 3.");
	
	
	

	//2º version con while
	
	int j=10; 

	while (j<=70) {
		if(j%3==0)
			System.out.println("El numero "+j+" es multiplo de 3");
	j++;
	}
}
}


		
	





