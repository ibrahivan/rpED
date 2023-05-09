package aplicacion.servicios;

public class ImplMenu implements InterfazMenu {

	@Override
	public void mostrarMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Matrícula de alumno");
		System.out.println("2. Borrar alumno");
		System.out.println("3. Listar alumnos con su portátil asignados");
		System.out.println("0. Salir");
	}

}
