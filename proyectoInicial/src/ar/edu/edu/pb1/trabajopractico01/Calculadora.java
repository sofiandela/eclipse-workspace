package ar.edu.edu.pb1.trabajopractico01;

public class Calculadora {
	private double operador1;
	private double operador2;
	
	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	
	public double dividir() {
		double resultado = 0.0;
		
		resultado = operador1 / operador2;
		
		return resultado;
	}

}
