package Ejercicio3;

public class Tablas {

	
	
//	public String saludar(String nombre) {
	//	return "hola te llamas " + nombre;
	//}

	public void media() {

		double array1[] = new double[5];

		// Rellenar el array
		for (int i = 0; i < array1.length; i++) {
			// Meter numeros entre -50 y +50
			array1[i] = (Math.random() * -100) + 50;
			System.out.print(array1[i] + " ");
		}

		// Comprobamos par/impar/Cero
		int ceros = 0, positivos = 0, negativos = 0;
		double sum_positivos=0,sum_negativos=0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				ceros = ceros++;
				
			} else if (array1[i] > 0) {
				sum_positivos=sum_positivos+array1[i];
				positivos = positivos+1;
			} else {
				negativos = negativos+1;
				sum_negativos=sum_negativos+array1[i];
			}
		}
     System.out.println("\nLa media de los positivos es "+(sum_positivos/positivos)+" y la de los negativos es "+(sum_negativos/negativos));
     System.out.println("y el numero de ceros es"+ceros);
     
	}

	

	
	
	
	
	
	

}
