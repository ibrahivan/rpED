package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.AlumPort;
import aplicacion.servicios.ImplAlumPort;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.InterfazAlumPort;
import aplicacion.servicios.InterfazMenu;



public class Menu {

	public static void main(String[] args) {
		//Inicializar la interfaz de repostaje y menu
				InterfazAlumPort intAP = new ImplAlumPort();
				InterfazMenu intM =new ImplMenu();		
				//Listado de cuentas (BD)
				List<AlumPort> listaAlumPort = new ArrayList<AlumPort>();
						
					// Imprimir el menú por consola
					// Scanner con la opción del usuario
						Scanner entradaOpcion = new Scanner(System.in);		
						Boolean cerrarMenu = false;
						int opcion;
						while(!cerrarMenu) {	
							//Mostramos el menú
							intM.mostrarMenu();
							System.out.println("Introduza la opción deseada: ");
							opcion = entradaOpcion.nextInt();
							System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
							
							switch (opcion) {			
								case 1:
									listaAlumPort=(intAP.addMatricula(listaAlumPort));
									break;
								case 2:
									listaAlumPort=(intAP.borrarAlum(listaAlumPort));
									break;
								case 3:
									intAP.listarAlumPort(listaAlumPort);
									break;
								case 0:
									break;
							
								default:					
									System.err.println("** Error opción "+opcion+" no disponible **");
									System.out.println("Introduzca la opción deseada [1..5]: ");
									opcion = entradaOpcion.nextInt();
									System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
							}
							
						}		
						System.out.println("Ha salido usted del programa. Gracias.");
					}
	
	}


