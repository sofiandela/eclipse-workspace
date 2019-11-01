import java.util.Scanner;

public class ElAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String jugadores[] = new String [2];
		
		String palabra = " ";
		String palabra2 = " ";
		
		
		System.out.println("Bienvenido al juego del ahorcado!");
		
			
			System.out.println("Ingrese el nombre del jugador 1: ");
			
			jugadores[0] = teclado.next();
			
			System.out.println("Ingrese el nombre del jugador 2: ");
			jugadores[1] = teclado.next();
			System.out.println("Ya estamos listos para empezar!");
			
			System.out.println(jugadores[0] + ", Ingrese una palabra:");
			palabra = teclado.next();
			
			System.out.println(jugadores[1] + ", Ingrese una palabra:");
			palabra2 = teclado.next();
			
			if(jugadores[0]){
				System.out.println("El jugador " + jugadores[0] + " comienda la partida!");
			}else{
				System.out.println("El jugador " + jugadores[1] + " comienda la partida!");
			}
			
			
		
		
//		System.out.println(jugadores[0] + " Ingrese la palabra para que la adivine " + jugadores[1]);
//		palabra = teclado.next();
//		System.out.println(jugadores[1] + " Ingrese la palabra para que la adivine " + jugadores[0]);
//		palabra2 = teclado.next();
		
		
		

	}

}
