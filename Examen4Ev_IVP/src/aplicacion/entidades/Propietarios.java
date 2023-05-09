package aplicacion.entidades;

public class Propietarios extends Usuarios{

	//Atributos
	private int numeroMascotas;

	//Constructor
	public Propietarios(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario,
			int numeroMascotas) {
		super(codigoIdentificador, nombre, apellidos, esVeterinario);
		this.numeroMascotas = numeroMascotas;
	}

	//Getters and Setters
	public int getNumeroMascotas() {
		return numeroMascotas;
	}

	public void setNumeroMascotas(int numeroMascotas) {
		this.numeroMascotas = numeroMascotas;
	}

	
	
	//toString
	@Override
	public String toString() {
		return "Propietarios [numeroMascotas=" + numeroMascotas + "]";
	}
	
}
