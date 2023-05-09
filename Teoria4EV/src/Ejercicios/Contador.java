package Ejercicios;

public class Contador {

	//Atributos
	private int maximo;
	private int contador;

	//Constructor
	public  Contador(int maximo, int contador) {
	}
	
	
	


	private void Resetear() {
		 this.contador=0;
	}
	
	public void Incrementar() {
		if(contador<=20) {
			System.out.println("Contador: "+contador);
			contador++;
			
		}
		else {
			Resetear();
			System.out.println("---------------");
			System.out.println("Empieza de nuevo el contador");
			System.out.println("---------------");
			
		}
			
		
		
	}
}
