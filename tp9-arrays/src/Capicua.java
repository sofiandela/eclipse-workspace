import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		String valorIngresado = "";
		int capicua[];
		
		System.out.println("CAPICUA VALIDATOR");
		System.out.println("Ingrese una serie de numeros");
		
		valorIngresado = teclado.next();
		
		capicua = new int[valorIngresado.length()];
		
		
		for(int i = 0; i<capicua.length; i++) {
			
			//carAt(i) devuelve el caracter del (tipo string) de la posición.
			//ahora ya tenemos el array de enteros.
			capicua[i] = Character.getNumericValue(valorIngresado.charAt(i));
			
		}
		
		int i = 0, j = capicua.length -1;
		
		while(capicua[i] == capicua[j] && i<j) {
			
			i++;
			j--;
			
		}
		//OTRA FORMA :) 
//		
//		if(i>=j) {
//			System.out.println("Si es capicua");
//		}else {
//			System.out.println("No es capicua");
//		}
//		
		
		if(capicua[i]!= capicua[j]) {
			System.out.println("No es capicua");
		}else {
			System.out.println("Si es capicua");
		}
		
		
		

	}

}
