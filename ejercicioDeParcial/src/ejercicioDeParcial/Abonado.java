package ejercicioDeParcial;

public class Abonado {
	
	private String nombreDeAbonado;
	private String patenteAbonado;
	private int valorAbonado = 100;

	public Abonado(String nombreDeAbonado, String patenteAbonado, int valorAbonado){
		
		this.nombreDeAbonado = nombreDeAbonado;
		this.patenteAbonado = patenteAbonado;
		this.valorAbonado = valorAbonado;
		
	}
	
	public void registrarAbonado(String nombreDeAbonado, String patenteAbonado, int valorAbonado) {
		this.valorAbonado = valorAbonado;
		this.patenteAbonado = patenteAbonado;
		this.nombreDeAbonado = nombreDeAbonado;
	}
	
	

	

}
