package tp5;

public class Calculadora {
	private double operador1;
	private double operador2;
	
	public Calculadora() {
		operador1 = 0.0;
		operador2 = 0.0;
		
	}
	
	public Calculadora(double operador1, double operador2) {
		this.operador1= operador1;
		this.operador2 = operador2;
	}
	
	public double sumar() {
		
		return operador1 + operador2;
	}
	
	//sobrecarga de metodos, mismo nombre, cambia la firma. 
	//en lugar de usar los atriburos, se suman los valores que se reciben por parámetro
	//recibe a las variables locales
	public double sumar(double operador1, double operador2) {
		
		return operador1 + operador2;
	}
	
	public double restar() {
		
		return operador1 - operador2;
	}
	
	public double restar(double operador1, double operador2) {
		
		return operador1 - operador2;
	}
	
	public double multiplicar() {
		return operador1 * operador2;
	}
	
	public double multiplicar(double operador1, double operador2) {
		return operador1 * operador2;
	}
	
	public double dividir() {
		double resultado;
		if(operador2!= 0) {
			resultado = operador1 / operador2;
		}
		else {
			resultado = 0;
		}
		return resultado;
	}
	
	public double dividir(double operador1, double operador2) {
		double resultado;
		if(operador2!= 0) {
			resultado = operador1 / operador2;
		}
		else {
			resultado = 0;
		}
		return resultado;
	}
	
	
	public int potencia(int base, int exponente) {
		int resultado = 1;
		
		for(int i=0; i<exponente; i++){
			resultado *= base;
		}
		
		return resultado;
		
	}
	
	public String esPrimo(int numeroAEvaluar) {
		boolean resultado = true;
		int resto = 0;
		
		for(int i=(numeroAEvaluar - 1) ; i>1; i--) {
			resto = numeroAEvaluar%i;
			
			if(resto == 0) {
				resultado = false;
			}
		}
			
			if(resultado) {
				return "Es primo";
			}else {
				return "No es primo";
			}
	
		
	}
	
	
	
	

}
