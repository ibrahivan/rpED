package aplicacion.entidades;

import java.io.*;
import java.util.List;

import aplicacion.controladores.Usuario;

public class GestionFicheros implements InterfazGestionFich{

	@Override
	public List<Usuario> lecturaFichero(String rutaFichero, List<Usuario>listaUsuario) {
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {

			// Apertura del fichero 
	
			archivo = new File (rutaFichero);	
			fr = new FileReader (archivo);	
			br = new BufferedReader(fr);
	
			// Lectura del fichero
	
			String linea = "";
			String[]vCampos;
			while((linea=br.readLine())!=null) {	
				vCampos=linea.split(";");
				crearUsuario(vCampos[0],vCampos[1],Integer.parseInt(vCampos[2]),listaUsuario);
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally{

			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
	
			try {
				if( null != fr )		
					fr.close();
			} catch (Exception e2) {	
				e2.printStackTrace();	
			}
		}
		return listaUsuario;
	}

	/**
	 * Método que crea objetos tipo usuario con los campos que recibe por parámetro y los guarda en la lista
	 * @param campoNombre
	 * @param campoApellido
	 * @param edad
	 * @param listaUser
	 * @return
	 */
	private List<Usuario> crearUsuario(String campoNombre, String campoApellido, int edad, List<Usuario> listaUsuario) {
		
		listaUs.add(new Usuario(campoNombre,campoApellido,edad));

		return listaUsuario;
	}

	



}
