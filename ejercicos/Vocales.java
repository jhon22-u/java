package ejercicos;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		String	cadena =entrada.nextLine();
		for (int i=0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || 
					cadena.charAt(i) == 'u') {
				continue;
			}else {
				System.out.print(cadena.charAt(i));
			}
			
		}

		
	 
		
		
		
		

	}

}
