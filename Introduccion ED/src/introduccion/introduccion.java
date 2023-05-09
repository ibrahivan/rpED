package introduccion;

import java.util.Scanner;

public class introduccion {

    public static void main(String[] args) {
    	
    	//Imprimir por pantalla
        System.out.println("Hola Mundo");//ln es para que escribe en distintos renglones si lo quitas lo escribiria todo junto
        System.out.printf("%.2f %.1f %s %n",12.3698, 5.83, "Ivan"); //f=float, %.2f  es para redondear al segundo decimal etc %n indica que hay un valor detras de la coma
        // el % indica que ahi va un valor, %n = salto de linea, f aproxima a 6 decimales si no marcas tu los que quieres
        // %s indica que va un valor de string
        
        //Declaraciones variables
        
        int edad; //numero entero corto
        long distancia; //numero entero largo hay que poner L al fnal del numero

        float peso; //decimal corto pero se la pone una f al final, 2.5f
        double tamaño; //decimal largo

        boolean esPrimo; //true o false

        String tuNombre; //Cadena de caracteres 
        																
        char tuLetraFavorita; //Caracter (letra, numero o simbolo)
        
        //void --> Tipo de dato quu no devuelve nada
        Void var; //en minuscula no me deja declararlo en mayuscula si
        
        
        long variableEnteraLarga; //
        Long variableEnteraLarga1;
        
      //Inicializar (primera vez o agisnar varibles (segunda vez)
      
       edad=25; //La variable de tipo entero edad tiene el valor 25

       tamaño=45.78; //La variable de tipo double tamaño tiene el valor 45.78
       
       esPrimo=false; //La variable de tipo double  tiene el valor falso
       
       tuNombre="Hola, yo soy Ivan y tengo 22 años"; //La variable de tipo String  tiene el valor , lo que esta escrito
       
       tuLetraFavorita='?'; //La variable de tipo char  tiene el valor '?' 
      
    		   //Con String escribimos doble comillas con char comillas simples!!
    	
        int numeroGrande=5000000;
        Long numeroGrande1= 5000000000000L;
        
        System.out.println(numeroGrande);
        System.out.println(numeroGrande1);
        
        //Expresiones
        int a;
        a = 3*4; //No genera error compilación pero si de ejecución pq no se puede vivdir entre 0
        //a=3.4*5.4 si seria erro de compìlacion pq es a es tipo int
        System.out.println(a);

        int d,b,c; // una variable inutil es si ponemos una mas y no leponemos nada
        d = 3*5+24;
        b = d+3;
        d = d +29;
        d = d*d+45;
        
        //Clase
        Integer numero1;
        numero1=700;
        System.out.println(numero1+500);

        String saludo="Hola";
        String despedida="Bye";
        System.out.print(saludo+" "+despedida+ "\n"); //las comillas espacio es para que deje hueco entra las palabras al ejecutar
        											  // el \n nos lo pondria en otr renglon si no queremos poner println
        											  //\t dejaria un tabulador de espacio
        
        //Impresion por pantalla
        
        //Crea una variable de tipo escaner para introducir un valor por teclado
        Scanner sc = new Scanner(System.in);
       //Creamos la variable donde vamos a guardar el valor leído
        int numero10;
        //Solicitamos el número
        System.out.println("Introduzca un número entero: \n");
       	//Leemos el valor y se lo asignamos a una variable
        numero10 = sc.nextInt(); 
        //Vamos a imprimir por pantalla la variable que hemos introducido por teclado
        System.out.println(numero10);
        
        //Casting (conversión)
        int aa=1;
        double bb=2.5;
        aa=(int)bb; //convierte un double a entero
        System.out.println(aa);
        
        //Definición de una constante (final ..)
        final int DIAS_SEMANA=7;
        //Si intentamos cambiar el valor de DIAS_SEMANA me dará un error
       
        
        		
        
        
        
        
        
        
    	}

    }