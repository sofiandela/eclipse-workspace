package ar.edu.edu.pb1.trabajopractico01;

public class PruebaCalculadora {

	public static void main(String[] args) {
		
		Calculadora casio = new Calculadora(10, 0);
		
		double resultado;
		resultado = casio.dividir();
		
		System.out.println("El resultado es " + casio.dividir());

	}

}
