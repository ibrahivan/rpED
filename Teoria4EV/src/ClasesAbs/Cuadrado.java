package ClasesAbs;

public class Cuadrado extends Figura{

	private int lado;
	public Cuadrado(String tipo, int lado) {
		super(tipo);
		this.lado=lado;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (double)(this.lado*this.lado) ;
	}

	
}
