package ClasesAbs;

public class Rectangulo extends Figura {

	private int base, altura;
	public Rectangulo(String tipo, int base, int altura) {
		super(tipo);
		this.base=base;
		this.altura=altura;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (double)(this.base*this.altura) ;
	}

}
