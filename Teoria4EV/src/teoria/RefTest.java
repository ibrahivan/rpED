package teoria;

public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Ejercicio 1

		     RefTest test = new RefTest();
		     Person p =new Person();
		     p.name = "Juan";
		     test.changeName(p,"Luis");
		     System.out.println(p.name);     //¿Qué se imprimirá por pantalla? Se imprime Luis
		}
		void changeName(Person pers, String other){
		     pers.name = other; //mantiene la misma referencia
		}


}



