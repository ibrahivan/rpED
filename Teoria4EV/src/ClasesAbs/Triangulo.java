package ClasesAbs;

public class Triangulo extends Figura { 
    private int base, altura; 

    public Triangulo(String tipo, int base, int altura) {
         super(tipo); 
         this.base=base;
         this.altura=altura;
    }




	@Override 
    public double area() {
         return (double) this.base * this.altura / 2; 
    } 
}
