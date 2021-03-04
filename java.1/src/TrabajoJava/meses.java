package TrabajoJava;

import java.util.Scanner;

public class meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("dame un dia 1 al 30:");
		System.out.print("dame dame un año:");
		System.out.print("dame un un mes 1 al 12:");
		 Scanner fechas = new Scanner(System.in);
		 Scanner meses = new Scanner(System.in);
		 Scanner a = new Scanner(System.in);
		 
		 int dia = fechas.nextInt();
		int mes = meses.nextInt();
		int año = a.nextInt();
		
		if (dia<1|| dia> 30 )System.out.print("Dia incorrecto :");
		if (mes<1 || mes> 12 )System.out.print("Mes incorrecto :");
		
		
		
		
		
		
	}
	
	
	
	
	

}
