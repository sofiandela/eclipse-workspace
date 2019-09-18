package ar.edu.edu.pb1.trabajopractico01.to03.dominio;

import ar.edu.edu.pb1.trabajopractico01.to03.prueba.$missing$;

public class Alarma {

	public Alarma() {
		// TODO Auto-generated constructor stub
		
		private Sensor sensorDeMovimiento;
		private Sensor sensorDeContacto;
		private Sensor sensorDeSonido;
		private boolean encendida;
		private int codigoDeSeguridad;
		
		//TODO crear otro constructor que reciba los sensores
		
		puclic Alarma(int codigoDeSeguridad, sensorDeMovimiento,sensorDeContacto, sensorDeSonido  ) {
			this.codigoDeSeguridad = codigoDeSeguridad;
			this.encendida = false;
			
			//tienen solamente un estado, true o false. El sensor no fue activado 
			this.sensorDeMovimiento = sensorDeMovimiento();
			sensorDeContacto = sensorDeContacto();
			sensorDeSonido= sensorDeSonido();
		}
		
		
		//en el constructor es recomendable INICIALIZAD cada una de las variables
		puclic Alarma(int codigoDeSeguridad) {
			this.codigoDeSeguridad = codigoDeSeguridad;
			this.encendida = false;
			
			//tienen solamente un estado, true o false. El sensor no fue activado 
			sensorDeMovimiento = new Sensor();
			sensorDeContacto = new Sensor();
			sensorDeSonido = new Sensor();
		}
		
//		para encender la alarma necesitamos el codigo de seguridad, para encender a esta alarma en particular necesito este codigo de seguridad en particular 
		
		public void encender(int codigoDeSeguridad) {
			if(codigoDeSeguridad == this.codigoDeSeguridad) {
				this.encendida = true;
			}
			
		}
		
		public void apagar(int codigoDeSeguridad) {
			if(codigoDeSeguridad == this.codigoDeSeguridad) {
				this.encendida = false; 
			}
		}
			
			
		public boolean encendida() {
			if(encendida) {
				return true;
			}else {
				return false;
			}
		}
			
		public boolean activada() {
			
			boolean alarmaActivada = false;
			
			return alarmaActivada;
			
			if(sensorDeContacto.activado()|| sensorDeMovimiento.activado() || sensorDeSonido.activado()) {
				alarmaActivada = true;
			}
	}
	
	

}
