package ar.edu.edu.pb1.trabajopractico01.to03.prueba;

import ar.edu.edu.pb1.trabajopractico01.to03.dominio.Alarma;

public class PruebaAlarma {

	public static void main(String[] args) {
		
		Alarma deAlejandro = new Alarma(1234);
		//Alarma deErica = new Alarma(54321);
		
		deAlejandro.encender(1234);
		
		if(deAlejandro.encendida()){
			System.out.println("Encendido con codigo correcto OK");
		}else {
			System.out.println("Encendido con codigo correcto FALLA");
		}
		
		deAlejandro.apagar(1234);
		
		if(!deAlejandro.encendida()) {
			System.out.println("Apagado con el codigo correcto OK");
		}else {
			System.out.println("Apagado con el codigo incorrecto FALLA");
		}
		
		
		
		
		
		
		
		
		

	}

	

}
