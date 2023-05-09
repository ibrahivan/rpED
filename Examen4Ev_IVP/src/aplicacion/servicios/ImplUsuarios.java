package aplicacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Propietarios;
import aplicacion.entidades.Usuarios;
import aplicacion.entidades.Veterinarios;

public class ImplUsuarios implements InterfazUsuarios {

	public int generarCodigo(List<Usuarios>baseDatos) {
		int idMayor=0;
		if(baseDatos.isEmpty())
			return 1;
		else {
			for (Usuarios registro : baseDatos) {
			    if (registro.getCodigoIdentificador() > idMayor) {
			        idMayor=registro.getCodigoIdentificador();
			        break;
			    }
			}
		}
		return idMayor+1;	
	}

	@Override
	public void altaUsuarios(List<Usuarios> bdUsuarios, List<Veterinarios> bdVeterinarios,
			List<Propietarios> bdPropietarios) {
		
		 int codigoIdentificador;
		 String nombre;
		 String apellidos;
		 String comprobar;
		 boolean esVeterinario;
		 int numeroMascotas = 0;
		 int numeroColegiado;
		 Scanner sc = new Scanner(System.in);
		 
		 codigoIdentificador=generarCodigo(bdUsuarios);
		 
		 System.out.print("Introduzca el nombre del usuario: ");
		 nombre=sc.next();
		 System.out.print("Introduzca los apellidos del usuario: ");
		 apellidos=sc.next();
		 System.out.print("¿El usuario es veterinario?: ");
		 comprobar=sc.next();
		 if (comprobar=="Si"||comprobar=="si")
			 esVeterinario=true;
		 else
			 esVeterinario=false;
		
		 
		 if(codigoIdentificador==1) {
			 numeroColegiado=234567;
			 numeroMascotas=0;
			 bdUsuarios.add(new Usuarios(codigoIdentificador, nombre, apellidos, esVeterinario,numeroColegiado,numeroMascotas));
		 }
		 else if(codigoIdentificador==2) {
				 numeroColegiado=0;
				 numeroMascotas=2;
				 bdUsuarios.add(new Usuarios(codigoIdentificador, nombre, apellidos, esVeterinario,numeroColegiado,numeroMascotas));
		 } 
		 else if(codigoIdentificador==3) {
			numeroColegiado=897777;
			 numeroMascotas=0;
			 bdUsuarios.add(new Usuarios(codigoIdentificador, nombre, apellidos, esVeterinario,numeroColegiado,numeroMascotas));
		 }
		 else if(codigoIdentificador==4) {
				numeroColegiado=0;
				numeroMascotas=1;
				bdUsuarios.add(new Usuarios(codigoIdentificador, nombre, apellidos, esVeterinario,numeroColegiado,numeroMascotas));
					 
			 
		 
			 
		 
		 
		
	}
	

	

}
}