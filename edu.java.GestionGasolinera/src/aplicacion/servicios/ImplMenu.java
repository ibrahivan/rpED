package aplicacion.servicios;

public class ImplMenu implements InterfazMenu {

	@Override
	public void mostrarMenu() {
		{
			System.out.println("\n--- Gasolinera ---");
			System.out.println("1. Repostaje normal");
			System.out.println("2. Repostaje factura");
			System.out.println("3. Mostrar repostajes");
			System.out.println("4. Borrar repostaje");
			System.out.println("5. Modificar repostaje");
			System.out.println("6. Salir");
		}
		
		
	}

}
