package aplicacion.servicios;

import java.util.ArrayList;
import java.util.List;

import aplicacion.entidades.Repostaje;
/**
 * Interfaz que define los metodos que dan servicio a la gestion de respostaje
 * @author ivan vazquez
 *
 */
public interface InterfazRepostaje {

	/**
	 * Realiza un repostaje normal
	 * @param 
	 */
	// cabecera /signatura repostaje normal
	public Repostaje RepostajeNormal();
	
	/**
	 * Realiza un nuevo repostaje con factura
	 * @param 
	 * @return 
	 */
	// cabecera /signatura repostaje con factura
	public Repostaje RepostajeFactura();
	
	/**
	 * Imprime por consola el listado de respostaje existente
	 */	
	// cabecera /signatura listado de todoso los repostajes
	public void MostrarRepostajes(ArrayList<Repostaje> listaRepos);
	
	/**
	 * Borra el repostaje seleccionado
	 */
	
	public ArrayList<Repostaje> BorrarRepostaje(ArrayList<Repostaje> listaRepos);
	
	/**
	 * Modifica algun parametro de alguna repostaje
	 */
	public ArrayList<Repostaje> ModificarRepostaje(ArrayList<Repostaje> listaRepos);
	
}
