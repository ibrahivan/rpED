package pruebaIvanVazquez;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoDNI {

	//Atributos
	private char [] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
	private int num;
	private char letra;
	
	//Getters y Setters

	public char[] getLetras() {
		return letras;
	}

	public void setLetras(char[] letras) {
		this.letras = letras;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	//Constructores
	
	public CalculoDNI() {
		super();
	}
		
	public CalculoDNI(char[] letras, int num, char letra) {
		super();
		this.letras = letras;
		this.num = num;
		this.letra = letra;
	}

	//Métodos
	
	public int pedirNum() {
		System.out.println("Introduce un numero para calcular DNI: ");
		Scanner sNum= new Scanner (System.in);
		int n=sNum.nextInt();
		
		return n;
	}

	public char pedirLetr()
	{
		System.out.println("Introduce una letra para el DNI: ");
		Scanner sLet= new Scanner (System.in);
		char let=sLet.next().charAt(0);
		return let;
		
	}

	public char calculoLetra(int n, char[] l) {
		
		int n1=n%23;
		char letra=l[n1];
		return letra;
		
		
	}
}
