package ar.edu.edu.pb1.trabajopractico01;

public class Letra {
	
	private char caracter;
	
	public Letra(char caracter) {
		this.caracter = caracter;
	}
	//CHAR CHARACTER es una variable "nueva"que va a devolver algo
	
	public boolean esVocal() {
		
		boolean resultado;
		
		switch(caracter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u' :
			resultado = true;
			break;
			
		default:
			resultado = false;
			
		
			
		}
		
		
		return resultado;
	}
	
	
public boolean esConsonante() {
		
		boolean resultado;
		
		switch(caracter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u' :
			resultado = false;
			
		default:
			resultado = true;	
		
			
		}
		
		
		return resultado;
	}
	
	

	
	
}