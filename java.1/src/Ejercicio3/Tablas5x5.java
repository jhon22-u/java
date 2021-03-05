package Ejercicio3;

public class Tablas5x5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// array de dos dimenciones 
		
		
		//int[][] lista = new int[7][7];
		int lista[][][] = new int[3][3][3];

		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int e = 0; e< 3; e++)
				lista[i][j][e] = i + j+ e;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(lista[i][j]+"-");
			System.out.println("\n");
		}
	}

	
	
	
	}
}
