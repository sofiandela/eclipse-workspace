import java.util.Scanner;

public class ClaseDePrueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int valor = teclado.nextInt();
		
		int arrayDefinidoPorTeclado[] = new int [valor];
		
		double promedio = 0.0;
		
		for(int i = 0; i < valor; i++) {
			
			double valoresRandom = Math.floor(Math.random()*(80+1));
			
			System.out.println("En la posicion " + i + " Se establecio el numero random " + valoresRandom);	
			
			promedio += valoresRandom;
		}
		
		System.out.println("El promedio total es de "+ promedio);
		

	}

}
