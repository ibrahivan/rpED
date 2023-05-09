package Herencias;

public class CA extends CB implements IC,Comparable{

	 //CA a = new CB(1,2,3); ¿qué valor devuelve “a.suma();”? No se puede hacer
	
	int x,y;
	public int suma() {
		return x+y;
	}
	@Override
	public int mayor() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	 
	 

	

	
	
	 
	
	
}
