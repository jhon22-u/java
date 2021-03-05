package Ejercicio3;

public class CuboEjmploProfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//public void mostrarArrays()
		{
			int [] array0=new int[3];
   			int[] [] array1=new int [3][3];
			int[][][] matriz = new int [3][3][3];
			
			//Unidimensional
			for (int i = 0; i < array0.length; i++) {
				array0[i]=1;
			}
			
			//Bidimensional
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1.length; j++) {
					array1[i][j]=1;
					
				}
				
			}
			
			//Multidimensional
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					for (int k = 0; k < matriz[i][j].length; k++) {
						if (k == 1) {
							
							matriz[i][j][k] = 1;
							
						}
					}
				}
			}
			System.out.println();
		}

		
		
		
	}

}
