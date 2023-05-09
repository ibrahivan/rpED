package apliacion.servicios;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import aplicacion.controladores.Usuario;
import aplicacion.entidades.GestionFicheros;
import aplicacion.entidades.InterfazGestionFich;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Usuario>listaUsario = new ArrayList<Usuario>();
		
		InterfazGestionFich gestionFichero = new GestionFicheros();
		gestionFichero.lecturaFichero("C:\\zDatosPruebas\\ficheroprueba.txt",listaUsario);
		
		//Se recorre la lista para mostrar los datos de los usuarios
		for(Usuario u : listaUsario) {
			System.out.println(u.toString());
		}
		
	}

}
