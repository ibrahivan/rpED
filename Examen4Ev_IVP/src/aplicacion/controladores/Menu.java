package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;

import aplicacion.entidades.Propietarios;
import aplicacion.entidades.Usuarios;
import aplicacion.entidades.Veterinarios;
import aplicacion.servicios.ImplGestionFicheros;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.ImplUsuarios;
import aplicacion.servicios.InterfazGestionFicheros;
import aplicacion.servicios.InterfazMenu;
import aplicacion.servicios.InterfazUsuarios;


public class Menu {

	//Constante con ruta del archivo de LOG en que se escribirá. Para evitar error debe cambiar por su username y existir en su escritorio. 
	public static final String RUTA_ARCHIVO_LOG = "C:\\zDatosPruebas\\datosEx4ED.txt"; 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Usuarios> bdUsuarios=new ArrayList<>(); 
		List<Veterinarios> bdVeterinario= new ArrayList<>(); 
		List<Propietarios> bdPropietario = new ArrayList<>(); 
		
		InterfazMenu intM = new ImplMenu();
		InterfazUsuarios intU =new ImplUsuarios();
		InterfazGestionFicheros intF = new ImplGestionFicheros();
		int opc=0;
		intM.mostrarMenu();
		while(opc<4) {
		intU.altaUsuarios(bdUsuarios, bdVeterinario, bdPropietario);
		intF.escrituraFichero(RUTA_ARCHIVO_LOG, bdUsuarios, bdVeterinario, bdPropietario);
		intF.lecturaFichero(RUTA_ARCHIVO_LOG);
		opc++;
		}
		
	}

}
