import java.util.Scanner;

public class ClaseDePrueba3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char arrayDeChars[] = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't' ,'u', 'v', 'w', 'x', 'y', 'z'};
		
		Scanner teclado = new Scanner(System.in);
		
		int valorIngresado = 0;
		
		String palabra = " ";
		
		//System.out.println(arrayDeChars.length);
		
		do {
			 valorIngresado = teclado.nextInt();
			 
			 if(valorIngresado >=0 && valorIngresado < 26) {
				 
				 palabra = palabra + arrayDeChars[valorIngresado];
				 
				 System.out.println("El valor ingresado es de: " + valorIngresado +" y corresponde a la posición "+ arrayDeChars[valorIngresado]);
				 
			 }

		}while(valorIngresado != -1);
		
		System.out.println("La palabra ingresada es: " + palabra);
		
		
		
		
		
		//No funciona con el -1 y mayor a 26
		
//		for(int i = 0; i<arrayDeChars.length; i++) {
//		
//		int valorIngresado = teclado.nextInt();
//			
//			if(valorIngresado == -1 && valorIngresado>26) {
//				break;
//				//System.out.println("Error, no existe posición -1");
//			}else {
//			System.out.println( "La posicion ingresada indica la letra: " + arrayDeChars[valorIngresado]);
//			}
//		
//	}
	
	
		
		
		//FUNCIONA PERO ESTA INCOMPLETO
//		//probar con do while, no hace falta recorrerlo
//		
//		for(int i = 0; i<arrayDeChars.length; i++) {
//			
//			int valorIngresado = teclado.nextInt();
//			
//				
//				System.out.println( "La posicion ingresada indica la letra: " + arrayDeChars[valorIngresado - 1]);
//				
//
//		}
		
		

	}

}
