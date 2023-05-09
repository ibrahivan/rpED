package aplicacion.entidades;

public class Veterinarios extends Usuarios {


	//Atributos
	private String numeroColegiado;
	
	//Constructor
	public Veterinarios(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario,
			String numeroColegiado) {
		super(codigoIdentificador, nombre, apellidos, esVeterinario);
		this.numeroColegiado = numeroColegiado;
	}

	//Getters and Setters
	public String getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(String numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	
	
	//toString 
	
	@Override
	public String toString() {
		return "Veterinarios [numeroColegiado=" + numeroColegiado + "]";
	}
	
	
}
