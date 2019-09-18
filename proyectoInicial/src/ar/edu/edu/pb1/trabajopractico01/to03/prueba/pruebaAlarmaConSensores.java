package ar.edu.edu.pb1.trabajopractico01.to03.prueba;

public class pruebaAlarmaConSensores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alarma deErica = new Alarma(654564);
		
		//instancio los sensores
		Sensor sensor1 = new Sensor();
		Sensor sensor2 = new Sensor();
		Sensor sensor3 = new Sensor();
		
		
		//constructor de Alarma de Erica
		Alarma deErica = new Alarma(654564, sensor1, sensor2, sensor3 );
	}
	
	if(deErica.activada()) {
		System.out.println("La ALARMA ESTA SONANDO OK, algo salio mal")
	}else {
		System.out.println("La ALARMA NO ESTA SONANDO, OK!")
	}
	
	
	sensor3.activar();
	
	
	

}
