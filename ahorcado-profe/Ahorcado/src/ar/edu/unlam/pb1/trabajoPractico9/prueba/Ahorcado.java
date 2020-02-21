package ar.edu.unlam.pb1.trabajoPractico9.prueba;

import java.util.Scanner;
import java.io.Console;

import ar.edu.unlam.pb1.trabajoPractico9.dominio.Partida;

public class Ahorcado {

	public static void main(String[] args) {
	
		String nombreJugador1, nombreJugador2, palabraAAdivinarJugador1, palabraAAdivinarJugador2;
		int opcionSeleccionada = 0;
		boolean elActualAdivino=false, elActualPerdio=false;
		Partida ahorcado;
		Scanner teclado = new Scanner(System.in);
		
		ahorcado = inicializarJuego(teclado);
		do {
			ahorcado.cambiarTurno();
			
			System.out.println("Turno de: " + ahorcado.getTurnoActual().getNombre());
			
			do{
				mostrarMenu();
				opcionSeleccionada = teclado.nextInt();
			}while(opcionSeleccionada!=1 && opcionSeleccionada!=2);
			
			if(opcionSeleccionada == 1) {
				arriesgarLetra(ahorcado, teclado);	
			}
			else {
				boolean resultadoDeLaAccion;
				
				resultadoDeLaAccion = arriesgarPalabra(ahorcado, teclado);
				
				if(resultadoDeLaAccion == true) {
					elActualAdivino=true;				
				}
				else {
					elActualPerdio=true;
				}
			}
		}while(ahorcado.getTurnoActual().getVidas()>0 && elActualAdivino==false && elActualPerdio == false);
		
		if(elActualAdivino == true) {
			System.out.println("El ganador es: " + ahorcado.getTurnoActual().getNombre());
		}
		else {
			ahorcado.cambiarTurno();
			System.out.println("El ganador es: " + ahorcado.getTurnoActual().getNombre());
		}
		
	}

	private static boolean arriesgarPalabra(Partida ahorcado, Scanner teclado) {
		boolean resultadoDeLaAccion;
		String palabraArriesgada;
		
		limpiarPantalla();
		System.out.println("Palabra a buscar: " + ahorcado.getTurnoActual().mostrarPalabraAAdivinar());
		System.out.println("Ingrese la palabra a arriesgar: ");
		palabraArriesgada = teclado.next();
		resultadoDeLaAccion = ahorcado.arriesgarPalabra(palabraArriesgada);
		return resultadoDeLaAccion;
	}

	private static void arriesgarLetra(Partida ahorcado, Scanner teclado) {
		char letraArriesgada;
		
		limpiarPantalla();
		System.out.println("Palabra a buscar: " + ahorcado.getTurnoActual().mostrarPalabraAAdivinar());
		System.out.println("Ingrese la letra a arriesgar: ");
		letraArriesgada = teclado.next().charAt(0);
		if(ahorcado.arriegarLetra(letraArriesgada) == true) {
			System.out.println("\nCorrecto!\n");
			System.out.println("Palabra a buscar: " + ahorcado.getTurnoActual().mostrarPalabraAAdivinar());
		}else {
			System.out.println("\nIncorrecto\n");
			ahorcado.getTurnoActual().perderVida();
		}
	}

	private static Partida inicializarJuego(Scanner teclado) {
		String nombreJugador1;
		String nombreJugador2;
		String palabraAAdivinarJugador1;
		String palabraAAdivinarJugador2;
		Partida ahorcado;
		System.out.println("Ingrese nombre jugador 1: ");
		nombreJugador1 = teclado.next();
		
		System.out.println("Ingrese nombre jugador 2: ");
		nombreJugador2 = teclado.next();
		
		ahorcado = new Partida(nombreJugador1, nombreJugador2);
		
		limpiarPantalla();
		
		System.out.println("Ingrese la palabra de jugador 1: ");
		palabraAAdivinarJugador1 = teclado.next();
		ahorcado.setPalabraAAdivinarJugador1(palabraAAdivinarJugador1);
		
		limpiarPantalla();		
		
		System.out.println("Ingrese la palabra del jugador 2: ");
		palabraAAdivinarJugador2 = teclado.next();
		ahorcado.setPalabraAAdivinarJugador2(palabraAAdivinarJugador2);
		
		limpiarPantalla();
		
		ahorcado.elegirIniciador();
		return ahorcado;
	}
	
	public static void limpiarPantalla() {
		for(int i=0; i<1000; i++) {
			System.out.println();
		}
	}

	public static void mostrarMenu() {		
		System.out.println("Seleccione la opcion deseada: ");
		System.out.println("1 - Ingresar letra: ");
		System.out.println("2 - Arriesgar: ");
	}
	

}
