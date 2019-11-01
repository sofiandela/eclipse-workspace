import java.util.Scanner;

public class ClaseDePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor;
		
		int enteros [] = new int [5];
		
		Scanner teclado = new Scanner(System.in);
		
		
		for(int i=0; i < enteros.length; i++) {
			
			valor = teclado.nextInt(); //esto "pushea" los valores a la variable valor
			
			enteros[i] = valor;
			
			
			System.out.println("En la posición "+ i + " se agregó el número " + enteros[i]);
			
		}
		
		
		
		
		
		
		
		
		

	}

}
