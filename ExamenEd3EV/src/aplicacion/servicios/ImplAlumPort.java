package aplicacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.AlumPort;


public class ImplAlumPort implements InterfazAlumPort {
	
	/**
	 * Calcula el id del alumno
	 * @param listAlum
	 * @return id del alumno
	 */
	private int calculoIdAlum(List<AlumPort>listAlum) {
		int auxiliar=0;
		for (int i = 0; i < listAlum.size(); i++) {			
			int j=listAlum.get(i).getIdAlum();
			if (auxiliar < j)
				auxiliar=j;
		}
		
		return auxiliar+1;
	}
	/**
	 * Calcula el id del portatil a partir de la marca y modelo
	 * @param a
	 * @param b
	 * @return id portatil con max 3 caracteres de marca y modelo concatenado con guion
	 */
	private String calculoIdPort(String a, String b) {
		AlumPort alumport = new AlumPort(); //tiene los valores de la clase AlumPort de los que cogeremos marca y modelo
		String c;
		if (alumport.getMarca().length()>3)
			a=alumport.getMarca().substring(0,3);
		if (alumport.getModelo().length()>3)
			b=alumport.getModelo().substring(0,3);
		c=a+"-"+b;
		return c;
	}

	/**
	 * Realizo todos las peticiones de datos para la matricula de alumno, ademas de los Id, y devuelvo la lista actualizada con los datos
	 */
	@Override
	public List<AlumPort> addMatricula(List<AlumPort> listAntigua) {
		Scanner valores= new Scanner (System.in);
		AlumPort alumport = new AlumPort(); // tienes los valores de la clase AlumPort
		System.out.println("Introduzca el nombre del alumno: ");
		alumport.setNombre(valores.next());
		System.out.println("Introduzca los apellidos del alumno:  ");
		alumport.setApellidos(valores.next());
		System.out.println("Introduzca el teléfono del alumno: ");
		alumport.setTelefono(valores.nextInt());
		System.out.println("Introduzca la marca del portátil: ");
		alumport.setMarca(valores.next());
		System.out.println("Introduzca el modelo del portátil: ");
		alumport.setModelo(valores.next());
		
		alumport.setIdAlum(calculoIdAlum(listAntigua));
		alumport.setIdPort(calculoIdPort(alumport.getMarca(), alumport.getModelo()));
		
		listAntigua.add(alumport);
		return listAntigua;
	}

	/**
	 * El meotodo pide el id del alumno que desea borrar y realiza la comprobacion de si existe para borrarlo y pasar la lista actualizada
	 */
	@Override
	public List<AlumPort> borrarAlum(List<AlumPort> listAntigua) {
		int id;
		AlumPort alumport = new AlumPort(); // tienes los valores de la clase AlumPort
		Scanner borrid= new Scanner (System.in);
		System.out.println("Digame el id del alumno del que desea borrar la información");
		id=borrid.nextInt();
		
		boolean existe = listAntigua.contains(id);
		while(!existe) {
			if (existe) {
				listAntigua.remove(alumport);
				System.out.println("El alumno fue borrado de la lista");
						} 
			else {
				System.out.println("El alumno no existe, prueba de nuevo.");
				System.out.println("Digame el id del alumno del que desea borrar la información");
				id=borrid.nextInt();
				 }
		}
		return listAntigua;
	}
	//Para borrar un alumno podriamos hacerlo asi
	// for (i=0; i<listaantigua.size; i++)
	//  	if(alumport.getIdalumno==n) n es el numero que querria borrar
	// 			listaantigua.remove(alumport)

	/** 
	 * Metodo para listar los alumnos
	 */
	@Override
	public void listarAlumPort(List<AlumPort>listAntigua) {
		AlumPort alumport = new AlumPort(); // tienes los valores de la clase AlumPort
		System.out.println("LISTADO DE ALUMNOS:");
		for (int i = 0; i < listAntigua.size(); i++) {
			System.out.println(alumport.toString());
		}
		
	}


	
	
	
	
	
	
}
