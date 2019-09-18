package ar.edu.edu.pb1.trabajopractico01.to03.dominio;

public class Sensor {

	public Sensor() {
		// TODO Auto-generated constructor stub
		
		private boolean estado;
		
		public Sensor(){
			estado = false;
		}
		
		public boolean activado() {
			return estado;
		}
		
		public void activar() {
			estado = true;
		}
		
		public boolean desactivar() {
			estado = false; 
		}
	}

}
