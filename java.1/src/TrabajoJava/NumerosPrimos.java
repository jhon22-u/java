package TrabajoJava;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
         int num = (int) ((Math.random()*8 -1)+1);
		
		boolean tablero[] = new boolean[10];
		boolean tableroImpactos[] = new boolean[10];
		
		
		tablero[num - 1] = true;
		tablero[num ] = true;
		tablero[num + 1] = true;
		
		Scanner scan = new Scanner(System.in);
		boolean hundido = false;
		int n = 0;
		int impactos = 0;
		while (!hundido) {
			System.out.println("Introduce una casilla: ");
			n = scan.nextInt();
			if (tablero[n] == false) {
				
				System.out.println("Agua");
				
			}else if (tableroImpactos[n] == true) {  
				
				System.out.println("Posicion ya bombardeada, prueba de nuevo");
				
			}else if ((tablero[n] == true)){
				
				tableroImpactos[n] = true;
				++impactos;
				if (impactos < 3) {
					System.out.println("Impacto!!!");
				}
				else {
					System.out.println("HUNDIDO");
					hundido = true;
				}
				
			}
			
		}
		
		System.out.println("Saliendo...");
		scan.close();


	}

}
