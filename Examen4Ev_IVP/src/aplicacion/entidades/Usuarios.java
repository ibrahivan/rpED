package aplicacion.entidades;

public class Usuarios {

	//Atributos
	private int codigoIdentificador;
	private String nombre;
	private String apellidos;
	private boolean esVeterinario;
	
	//Constructor
	
	public Usuarios(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario) {
		super();
		this.codigoIdentificador = codigoIdentificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.esVeterinario = esVeterinario;
	}
	
	public Usuarios(int codigoIdentificador2, String nombre2, String apellidos2, boolean esVeterinario2,
			int numeroColegiado, int numeroMascotas) {
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}
	
	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public boolean isEsVeterinario() {
		return esVeterinario;
	}
	public void setEsVeterinario(boolean esVeterinario) {
		this.esVeterinario = esVeterinario;
	}
	
	//toString
	@Override
	public String toString() {
		return "Usuarios [codigoIdentificador=" + codigoIdentificador + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", esVeterinario=" + esVeterinario + "]";
	}
	
	
	
	
}
