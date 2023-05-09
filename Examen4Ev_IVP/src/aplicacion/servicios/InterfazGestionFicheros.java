package aplicacion.servicios;

import java.util.List;
import aplicacion.entidades.Usuarios;
import aplicacion.entidades.Propietarios;
import aplicacion.entidades.Veterinarios;


public interface InterfazGestionFicheros {

	/**
	 * Este método realiza la escritura de los datos en el fichero de la ruta que recibe por argumento
	 * @param rutaFichero (ruta absoluta donde se encuentra el fichero)
	 */
	void escrituraFichero(String rutaFichero, List<Usuarios> bdUsuarios, List<Veterinarios> bdVeterinario, List<Propietarios> bdPropietario);
	/**
	 * Método encargado de leer el fichero de datos
	 * @param rutaFichero
	 */
	void lecturaFichero(String rutaFichero);
}
