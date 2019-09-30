package tpfor;

public class EjemploTP {

	public static void main(String[] args) {
		
		int sumatoria = 0;
		int factorial = 1;
		int potencia = 1;
		
			for(int  i = 0; i < 10; i++) {
				System.out.println(i);
			}

	
	

			//para obtener pares hasta el 100
			
			for(int i = 0; i < 100; i ++) {
				
				if(i%2==0) {
					
					System.out.println("El número par es : " + i);
				}
				
			}
			
			
			
			//SUMATORIA
			for(int i = 0; i<20; i++) {
				
				 sumatoria += i;
				 
			}
			System.out.println("La sumatoria es: " + sumatoria);
			
			

			
			//POTENCIA rtado = 1048576
			for(int i = 0; i<20; i++) {
				
				potencia *= 2;
				 
			}
			
			System.out.println("La potencia es: " + potencia);
			
			
			
			
			// IMPRIMIR EL FACTORIAL DE 9
			for(int i=9; i>0; i--) {
				
				factorial *= i;
			}
			
			System.out.println("El factorial es: " + factorial);

	}
	
}
