package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Propietarios;
import aplicacion.entidades.Usuarios;
import aplicacion.entidades.Veterinarios;

public interface InterfazUsuarios {

	public int generarCodigo(List<Usuarios>baseDatos);
	
	public void altaUsuarios(List<Usuarios> bdUsuarios, List<Veterinarios> bdVeterinarios, List<Propietarios> bdPropietarios);
}
