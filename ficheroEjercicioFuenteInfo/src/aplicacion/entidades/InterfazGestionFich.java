package aplicacion.entidades;

import java.io.*;
import java.util.List;

import aplicacion.controladores.Usuario;

public interface InterfazGestionFich {

	List<Usuario> lecturaFichero(String rutaFichero, List<Usuario>listaUsuario);
	
}
