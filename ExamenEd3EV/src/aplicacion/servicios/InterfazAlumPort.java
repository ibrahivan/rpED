package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.AlumPort;
/**
 * Interfaz que define los metodos que dan servicio a la gestion del alumno y su portatil
 * @author ivan vazquez
 *
 */
public interface InterfazAlumPort {
	
	/**
	 * Actualiza la lista con lo nuevos datos de la matricula
	 * @param listAntigua
	 * @return lista actualizada
	 */
	//cabecera metodo
	public List<AlumPort> addMatricula (List<AlumPort>listAntigua);
	
	/**
	 * Actualiza los datos borrando el alumno que pide
	 * @param listAntigua
	 * @return lista actualiza
	 */
	public List<AlumPort> borrarAlum (List<AlumPort>listAntigua);

	/**
	 * Imrpime por consola el listado de alumnos con su portatil
	 */
	public void listarAlumPort (List<AlumPort>listAntigua);
}
