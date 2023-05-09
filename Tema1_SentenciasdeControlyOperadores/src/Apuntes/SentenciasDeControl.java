package Apuntes;

public class SentenciasDeControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 if-else ; Evalúa una condición y según sea cierta o falsa ejecuta un bloque/ámbito de sentencia u otro. 
		
		int a=5;
		int b=6;
		
		if (a<=b)         	
		{
			System.out.println("El número a es menor que b.");
		}
		else 
		{
			System.out.println("El número a NO es menor que b.");
		}   //cuando solo hay una linea de instruccion realmente 
		    //no es necesario poner las llaves en ninguna, pero sino fuese asi daria error
			
		System.out.println("-------------------------");
		
		//2 switch;
		int c;  //se utiliza cuando se quiere comparar una variable de un tipo discreto
				//con una serie de valores diferentes. En la sentencia switch, se indican los posibles valores
				//que puede tomar la variable y las sentencias que se tienen que ejecutar si la variable
				//coincide con alguno de dichos valores.
		c=9;
		
		switch(c) 
		{
			case 0:
				System.out.println("El número es 0.");
				break;
			case 1:
				System.out.println("el número es 1.");
				break;
			case 4:
				System.out.println("El número es par.");
				break;
			case 9:
				System.out.println("El número es multiplo de 3.");
				break;
			default:
				System.out.println("No se ha cumplido ningun case.");
			
		
		}
		
		System.out.println("-------------------------");
		
		
		// 3 while
		int inicio=0;
		int fin=20;
		
		while(inicio<=fin ) {
			System.out.println(inicio);
			inicio= inicio + 5;
			}
		System.out.println("-------------------------");
		// 4 for , inicializar variable, condicion, actualizacion
		for (int comienzo=0; comienzo<=fin; comienzo+=5) {
			System.out.println(comienzo);
		System.out.println("-------------------------");
		//5 Operadores aritmeticos
			int martes=0; 
			martes=martes +5; //suma
			martes=martes-9; //resta
			martes*=2;		//multiplicacion
			martes/=-8;		//divison
			martes=martes%1; //resto , aqui tiene q dar ya 0
			System.out.println(martes);
		System.out.println("-------------------------");
		//6 Operadores lógicos
		boolean b1=(5==6)&&(7==7);
		boolean b2=('a'=='b'||5==5);
		boolean b3=!("hola"=="hoLa"); //negado
		System.out.println(b1+" "+b2+" "+b3);
		System.out.println("-------------------------");
		//7 Operadores relacionales
		
		if (b2!=b3) {
			System.out.println("Aqui no va a entrar ya q no es cierto");
		}
		else {
			System.out.println("Aqui si entra");
			System.err.println("Error de prueba");
		}
		
		}
	}
}
					
		

	


