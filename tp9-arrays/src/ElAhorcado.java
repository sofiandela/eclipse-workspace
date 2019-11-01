import java.util.Scanner;

public class ElAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String jugadores[] = new String [2];
		
		String palabra = " ";
		String palabra2 = " ";
		
		
		System.out.println("Bienvenido al juego del ahorcado!");
		
		for(int i = 0; i<jugadores.length; i++ ) {
			
			System.out.println("Ingrese el nombre del jugador 1: ");
			jugadores[i] = add(jugadores, teclado.next(););
			jugadores[i] = teclado.next();
			System.out.println("Ingrese el nombre del jugador 2: ");
			jugadores[i] = teclado.next();
			System.out.println("Ya estamos listos para empezar!");
			
			
			System.out.println(jugadores[i] + ", Ingrese una palabra:");
			
			palabra = teclado.next();
			
			
		}
		
		
//		System.out.println(jugadores[0] + " Ingrese la palabra para que la adivine " + jugadores[1]);
//		palabra = teclado.next();
//		System.out.println(jugadores[1] + " Ingrese la palabra para que la adivine " + jugadores[0]);
//		palabra2 = teclado.next();
		
		
		

	}

}
