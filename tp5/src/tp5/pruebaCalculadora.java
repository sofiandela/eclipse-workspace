package tp5;


public class pruebaCalculadora {

	public static void main(String[] args) {
		
			Calculadora casio = new Calculadora();
			
			System.out.println("0 a la 1 es: " + casio.potencia(0, 1));
			System.out.println("0 a la 2 es: " + casio.potencia(0, 2));
			System.out.println("1 a la 0 es: " + casio.potencia(1, 0));
			System.out.println("1 a la 1 es: " + casio.potencia(1, 1));
			System.out.println("1 a la 2 es: " + casio.potencia(1, 2));
			System.out.println("2 a la 0 es: " + casio.potencia(2, 0));
			System.out.println("2 a la 1 es: " + casio.potencia(2, 1));
			System.out.println("2 a la 2 es: " + casio.potencia(2, 2));
			System.out.println("2 a la 3 es: " + casio.potencia(2, 3));
			
			
			System.out.println("El numero 5 es primo? " + casio.esPrimo(5));
			System.out.println("El numero 4 es primo? " + casio.esPrimo(4));
			System.out.println("El numero 20873 es primo? " + casio.esPrimo(20873));
			System.out.println("El numero 7 es primo? " + casio.esPrimo(7));
			

	}

}
