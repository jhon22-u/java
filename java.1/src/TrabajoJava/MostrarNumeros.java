package TrabajoJava;

import java.util.Scanner;

public class MostrarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un numero 15 numeros de 1 al 100: ");
		Scanner n = new Scanner(System.in);
		
		
		 int numero;
		 int suma ;
		 int contador;
		 int medida;
		
		 
		 numero=n.nextInt();  
		 suma= 0;
		 contador= 0;
		 
		while (numero>=1) {
			suma+=numero;
			 System.out.println("Introduzca otro por favor numero: ");
			 numero=n.nextInt();
			 
		} if(numero== 1) {
			
			System.out.println("Terminamos");
			
		} else {
			medida= suma+contador;
			 
			 System.out.println("Tu suma es "+ medida);
		}
		
		
		
	}

}
