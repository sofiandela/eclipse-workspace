package sudoku;

public class Sudoku {

	private int tablero [] [] = new int [9] [9];
	private int fila;
	private int columna;
	private int valor;
	
	public Sudoku(int tablero[][]){
		this.tablero = tablero;
		
	}
	
	public boolean validar() {
		boolean resultadoFilas = validarFilas();
		boolean resultadoColumnas = validarColumnas();
		boolean resultadoCuadrantes = validarCuadrantes();
		
		if(resultadoFilas == true && resultadoColumnas == true && resultadoCuadrantes == true) {
			
			return true;
			
		}else {
			return false;
		}

	}
	
	public void ingresarValor(int fila, int columna, int valor) {
		this.fila = fila;
		this.columna = columna;
		this.tablero[fila][columna] = valor;
		
		//if (valor>0)&& valor<=CAantidad_digitos)
		
	}
	
	public String toString() {
		return " " + tablero;
	}
	
	public boolean juegoTerminado() {
		if(validar()== true && valor != 0) {
			return true;
		}else {
			return false;
		}
		
	}
	//analiza todas las fila
	private boolean validarFilas() {
		return validarFila(fila);
		
	}
	
	private boolean validarColumnas() {
		return validarColumna(columna);
		
	}
	
//	private boolean validarCuadrantes() {
//		
//	}
	
	private boolean validarFila(int fila) {
		for (int i= 0; i<9; i++) {
			for(int j = columna;j<9; j++) {
				
			}
		}
	}
	
	private boolean validarColumna(int columna) {
		
	}
	
//	private boolean validarCuadrante(int filaCuadrante, int columnaCuandrante) {
//		
//	}

}
