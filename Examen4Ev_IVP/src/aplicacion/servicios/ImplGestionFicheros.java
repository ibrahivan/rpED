package aplicacion.servicios;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.swing.JOptionPane;

import aplicacion.entidades.Propietarios;
import aplicacion.entidades.Usuarios;
import aplicacion.entidades.Veterinarios;

public class ImplGestionFicheros implements InterfazGestionFicheros {

	@Override
	public void escrituraFichero(String rutaFichero, List<Usuarios> bdUsuarios, List<Veterinarios> bdVeterinario,
			List<Propietarios> bdPropietario) {
		// TODO Auto-generated method stub

		FileWriter fichero= null;
		PrintWriter pw = null;

		try {

			fichero = new FileWriter(rutaFichero);	
			pw = new PrintWriter(fichero);

			for(Usuarios usuarios : bdUsuarios) 
				pw.printf(usuarios.toString());
			
			for(Veterinarios veterinarios : bdVeterinario) 
				pw.printf(veterinarios.toString());	
			
			for(Propietarios propietarios : bdPropietario) 
				pw.printf(propietarios.toString());	
			
			JOptionPane.showMessageDialog(null, "Archivo de datos escrito correctamente en "+rutaFichero);
			
		 } catch (IOException ioe) {
			 Toolkit.getDefaultToolkit().beep();
			 JOptionPane.showMessageDialog(null,"[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" + ioe);
	     } finally {
	    	 try {
	    		 if (null != fichero)
	        		   fichero.close();
	          }catch (IOException ioe2){
	        	  Toolkit.getDefaultToolkit().beep();
	        	  JOptionPane.showMessageDialog(null,"[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
		      }
	       }		
	}

	@Override
	public void lecturaFichero(String rutaFichero) {
		// TODO Auto-generated method stub

		File fichero = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	    	  
	    	 fichero = new File (rutaFichero);
	         fr = new FileReader (fichero);
	         br = new BufferedReader(fr);

	         String linea;
	         while((linea=br.readLine())!=null) {
	            System.out.println(linea);
	         }
	         
	      }	catch(FileNotFoundException fnfe){
	    	  Toolkit.getDefaultToolkit().beep();
	    	  JOptionPane.showMessageDialog(null,"[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" +fnfe); 
	      } catch(IOException ioe){
	    	  Toolkit.getDefaultToolkit().beep();
	    	  JOptionPane.showMessageDialog(null,"[ERROR] - ERROR AL LEER LINEA: " + ioe); 
	      } finally{ 
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (IOException ioe2){
	        	 Toolkit.getDefaultToolkit().beep();
	        	 JOptionPane.showMessageDialog(null,"[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
	         }
	      }
	}
}


