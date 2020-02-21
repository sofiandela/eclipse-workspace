package arrayBidimensional;

import java.util.Scanner;

public class ElementoABuscar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Ingrese un numero: ");
		Scanner teclado = new Scanner(System.in);
		int vector [] = {11,8,33,14,5 };
		int elementoABuscar = teclado.nextInt();
		int posicion = 0;
		
		
		
		for(int i = 0; i<vector.length; i++) {
			if(elementoABuscar == vector[i]) {
				posicion = i+1;
				
			}
		}
		
		System.out.println("El numero que ingresaste se encuentra en la posición " + posicion + " del array");
		
		
		
		
		
		
	}

}
