package aplicacion.entidades;

public class Repostaje {

	private String fecha="aaa";
	private float litros;
	private float importe;
	private String dni="aaa";
	private String matricula="aaa";
	
	
	public String toString() {
		return " [fecha=" + fecha + ", litros=" + litros + ", importe=" + importe + "$, dni=" + dni
				+ ", matricula=" + matricula + "]";
	}

	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	
	public Repostaje() {
		super();
	}
	
	public Repostaje(String fecha, float litros, float importe) {
		super();
		this.fecha = fecha;
		this.litros = litros;
		this.importe = importe;
	}

	public Repostaje(String fecha, float litros, float importe, String dni, String matricula) {
		super();
		this.fecha = fecha;
		this.litros = litros;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
	}
	
	
	
	
	
}
