package ejercicos;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String frase;
		frase = entrada.nextLine();
		String catater =entrada.next();
		
		//averigu longitud
		int longitud = frase.length();
		System.out.println("la cadena mide " + longitud);
		
		//Pintar asteriscos
		for (int i = 0; i < longitud; i++) {
			System.out.print("carater");
		}

	

	}

}
