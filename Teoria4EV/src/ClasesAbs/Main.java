package ClasesAbs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo t = new Triangulo("Triangulo",20,10);
		Cuadrado c = new Cuadrado("Cuadrado", 20);
		Rectangulo r = new Rectangulo("Rectangulo", 15, 3);
		
		System.out.println("Triangulo: "+t.area());
		System.out.println("Cuadrado: "+c.area());
		System.out.println("Rectángulo: "+r.area());
	}

}
