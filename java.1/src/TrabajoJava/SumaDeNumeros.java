package TrabajoJava;

import java.util.Scanner;

public class SumaDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numero= new Scanner(System.in);

		int num;
		int cont=0;
		boolean marcador=true;
		
	
		
		do {  	
			System.out.println("Dime un numero");
				num=numero.nextInt();
		
		if (num >=0) {
			cont++;
			}
		
		else   {
			marcador=false;
			}
		
	} while (marcador);
	System.out.println("Has introducido "+ cont + " numeros");	
	}

		
		
		
		 
		
		
	}


