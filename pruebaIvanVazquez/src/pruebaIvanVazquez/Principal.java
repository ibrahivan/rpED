package pruebaIvanVazquez;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor
		CalculoDNI dni = new CalculoDNI();
		int n; char letra , letraCal;
		
		n=dni.pedirNum();
		dni.setNum(n);
		letra=dni.pedirLetr();
		dni.setLetra(letra);
		
		while (n<0||n>99999999) {
			System.out.println("Número proporcionado no válido.");
			n=dni.pedirNum();
			dni.setNum(n);
		}

		letraCal=dni.calculoLetra(n, dni.getLetras());
		
		while(letraCal!=letra) {
			System.out.println("La letra indicada no es correcta.");
			letra=dni.pedirLetr();
			dni.setLetra(letra);
		}
		
		System.out.println("Ya esta todo correcto.");
		System.out.println("DNI:"+dni.getNum()+"-"+dni.getLetra());
	}

}
