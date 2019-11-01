import java.util.Scanner;

public class ClaseDePrueba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		Scanner teclado2 = new Scanner(System.in);
		
		//Siempre instanciar el length del array, vacío o con numeros
		
		String alumnos[] = new 	String [2];
		float notasDeAlumnos[] = new float [2];
		//int i = 0;
		
		
		
		for(int i=0; i<alumnos.length; i++) {
			
			System.out.println("Ingrese el nombre del alumno");
			alumnos [i] = teclado.next();
			System.out.println("Ingrese la nota del alumno");
			notasDeAlumnos[i] = teclado2.nextFloat();
			
			
			if(notasDeAlumnos[i]<4) {
				System.out.println("El alumno " + alumnos[i] + "ha reprobado el curso" );
				
			}else {
				if(notasDeAlumnos[i]>=4 && notasDeAlumnos[i]<7) {
					System.out.println("El alumno " + alumnos[i] + "ha aprobado el curso");
				}else {
					if(notasDeAlumnos[i] >= 7 && notasDeAlumnos[i] <= 10) {
						System.out.println("El alumno " + alumnos[i] + " ha Promocionado el curso");
					}
				}
			}
			
			
			
		}
		
		
		

	}

}
