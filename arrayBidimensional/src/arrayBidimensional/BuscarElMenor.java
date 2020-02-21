package arrayBidimensional;

public class BuscarElMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector [] = {11,8,33,14,5 };
		int menor = 999999;
		int posicion = 0;
		
		
		for(int i = 0; i<vector.length; i++) {
			if (menor > vector [i]) {
				menor = vector [i];
				posicion = i+1;
			}
		}
		System.out.println("El numero menor del array es: " + menor);
	}

}
