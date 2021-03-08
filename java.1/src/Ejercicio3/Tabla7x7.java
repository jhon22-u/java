package Ejercicio3;

public class Tabla7x7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//public void matrices_2() {
			// Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la
			// diagonal
			// principal sean 1 y el resto 0.
			int T[][] = new int[10][10];

			// Relleno la tabla
			for (int n = 0; n < T.length; n++) {

				T[n][n] = 1;

			}

			// Muestra la tabla
			for (int z = 0; z < T.length; z++) {
				for (int h = 0; h < T[z].length; h++) {
					System.out.print(T[z][h]);
				}
				System.out.println();
			}
		}

		
		
		
		
		
		
		
	}


