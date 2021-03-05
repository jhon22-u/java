package Ejercicio3;

import com.sun.tools.javac.code.Type.ForAll;

public class Cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public void cubo() {
			
			int[][][] matriz = new int [3][3][3];
			
			//rellenar con 1 lamina central
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					for (int k = 0; k < matriz[i][j].length; k++) {
						if (k == 1) {
							
							matriz[i][j][k] = 1;
							
						}
					}
				}
			}
			
			//mostrar por laminas
			for (int i = 0; i < matriz.length; i++) {
				System.out.println("Lámina " + (i + 1));
				for (int j = 0; j < matriz[i].length; j++) {
					for (int k = 0; k < matriz[i][j].length; k++) {
							
							System.out.print(matriz[j][k][i]);
							
						
					}
					System.out.println();
				}
				System.out.println();
			}
			
		} 

      
		
		
		
		
	}	
	
	