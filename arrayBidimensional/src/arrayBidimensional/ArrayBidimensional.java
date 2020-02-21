package arrayBidimensional;

import java.util.Scanner;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char matrizDeNombres [][] = new char [4][4];
		char vector1[] = {'A', 'l', 'a', 'n'};
		char vector2[] = {'J', 'u', 'a', 'n'};
		char vector3[] = {'P', 'l', 'a', 'n'};
		char vector4[] = {'P', 'e', 'p', 'e'};
		
		for(int i = 0; i< matrizDeNombres.length; i++) {
			
			for(int j = 0; j< matrizDeNombres[0].length; j++) {
				
				matrizDeNombres[0][j] = vector1 [j];
				matrizDeNombres[1][j] = vector2 [j];
				matrizDeNombres[2][j] = vector3 [j];
				matrizDeNombres[3][j] = vector4 [j];
			
			}
			
		}
		
		for(int i = 0; i< matrizDeNombres.length; i++) {
			System.out.println(" ");
			for(int j = 0; j< matrizDeNombres[0].length; j++) {
				
				System.out.print(matrizDeNombres[i][j]);
			
			}
			
		}
	}

}
