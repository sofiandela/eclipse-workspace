import java.util.Arrays;
import java.util.Scanner;

public class ElAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String jugadores[] = new String [2];
		String palabraIngresada [] = new String [4];
		int vidasJugador1, vidasJugador2 = 6;
		
		
		System.out.println("Bienvenido al juego del ahorcado!");
		
			//ingreso de nombres
			System.out.println("Ingrese el nombre del jugador 1: ");
			jugadores[0] = teclado.next();
			
			System.out.println("Ingrese el nombre del jugador 2: ");
			jugadores[1] = teclado.next();
			System.out.println("Ya estamos listos para empezar!");
			
			//ingreso de palabras
			
			System.out.println(jugadores[0] + ", Ingrese una palabra:");
			palabraIngresada[0] = teclado.next().toUpperCase();
			palabraIngresada[1] = "_ ".repeat(palabraIngresada[0].length());
			System.out.println(palabraIngresada[1]);
			
			System.out.println(jugadores[1] + ", Ingrese una palabra:");
			palabraIngresada[2] = teclado.next().toUpperCase();
			palabraIngresada[3] = "_ ".repeat(palabraIngresada[2].length());
			System.out.println(palabraIngresada[3]);
			
			
			double empiezaLaPartida = Math.floor(Math.random() * 2);
			System.out.println(empiezaLaPartida);
			
			if(empiezaLaPartida == 0.0){
				System.out.println("El jugador " + jugadores[0] + " comienza la partida!");
				
				palabraIngresada = new String[palabraIngresada[1].length()];
				
				for(int i = 0; i<palabraIngresada[0].length(); i++) {
					System.out.println(palabraIngresada[3]);
					char charIngresado = teclado.next().charAt(0);
					
//					if()

					

				}
				
				
			}else{
				System.out.println("El jugador " + jugadores[1] + " comienza la partida!");
				for(int i = 0; i<palabraIngresada[2].length(); i++) {
					System.out.println(palabraIngresada[1]);
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
//		System.out.println(jugadores[0] + " Ingrese la palabra para que la adivine " + jugadores[1]);
//		palabra = teclado.next();
//		System.out.println(jugadores[1] + " Ingrese la palabra para que la adivine " + jugadores[0]);
//		palabra2 = teclado.next();
		
		
		

	}

}
