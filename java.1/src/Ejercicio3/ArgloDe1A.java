package Ejercicio3;

import java.util.Scanner;

public class ArgloDe1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cont = new Scanner(System.in);
		
		int array0[],
		 array1[], array2[];
		
		array0 = new int [1];
		array1 = new int [1];
		array2= new int [21];
		
		
		
		
		System.out.println("digite el primer numero: ");
		for(int i =0;i<10 ;i++) {
			
			System.out.print((i+1)+"Digite un numero :");
			array0[i] = cont.nextInt();
			
		}
		System.out.println("ahora letras:");
		 for(int i =0 ; i <10; i++) {
			
			System.out.print((i+1)+"dame una letra: ");
            // Scanner letras= new Scanner(System.in);
			array1[i] =cont.nextInt();
			
	           
		 }   
	           
	       int j =0;
		  for(int i=0; i<10; i++) {
		 
		 array2[j] =array0[i];
		 j++;
		 
		 array2[j] = array1[i];
		 j++;
		  }
		 
		 // for (int i =0; i< 20; i++);{
		 System.out.print("El tercer array es "+ array2[j]);
		 
		  
		
		// no terminado 
		
		
	}

}
