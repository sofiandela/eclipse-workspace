package ar.edu.edu.pb1.trabajopractico01;

public interface identificarLetra {
	public static void main (String args[]) {
		
		Letra algunaLetra = new Letra('j');
		
		System.out.println(algunaLetra.esVocal());
		System.out.println(algunaLetra.esConsonante());
	}

}
