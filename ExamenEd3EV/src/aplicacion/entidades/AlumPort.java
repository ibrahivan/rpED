package aplicacion.entidades;

public class AlumPort {

	//Escribimos los atributos tanto de alumno como del portatil
	private int idAlum;
	private String nombre= "aaaaaaaaaa"; //para que no trabajemos con atributos nulos
	private String apellidos= "aaaaaaaaaa";
	private int telefono;
	private String idPort= "aaaaaaaaaa";;
	private String marca = "aaaaaaaaaa";
	private String modelo = "aaaaaaaaaa";
	
	//Generamos los Getters y Setters
	public int getIdAlum() {
		return idAlum;
	}
	public void setIdAlum(int idAlum) {
		this.idAlum = idAlum;
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getIdPort() {
		return idPort;
	}
	public void setIdPort(String idPort) {
		this.idPort = idPort;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//ToString con lo que queremos mostrar
	@Override
	public String toString() {
		return "Alumno [idAlum=" + idAlum + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono="
				+ telefono + ", idPort=" + idPort + "]";
	}
	
	
	//No ponemos constructores por que usaremos por defecto el vacio
}
