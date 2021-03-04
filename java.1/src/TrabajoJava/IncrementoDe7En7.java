package TrabajoJava;

import java.util.Scanner;

public class IncrementoDe7En7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un numero: ");
          Scanner n = new Scanner(System.in);
		
		int numero;
		numero=n.nextInt();
		
		for ( int i=100 ; i>=numero ;i -= 7)
		System.out.println(i);
		
	}

}
