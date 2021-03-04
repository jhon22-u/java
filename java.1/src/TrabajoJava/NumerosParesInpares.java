package TrabajoJava;

import java.util.Scanner;

public class NumerosParesInpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int numero = 0;
	       int pares = 0;
	       int impares = 0;
	       int ceros = 0;
	       int mediaPares = 0;
	       int mediaImpares = 0;
	       
	       for(int i = 0; i <= 100; i++){
	       
	           numero = (int)(Math.random()*10+1);
	           if(numero%2 == 0){
	               
	               pares++;
	               mediaPares++;
	               
	               
	               if(numero == 0 || numero == 10){
	               
	                   ceros++;
	               }
	               
	           } else if(numero%2 !=0){
	           
	               impares++;
	               mediaImpares++;
	               
	           } 
	           
	       }
	       
	       System.out.println("La media de pares es: " + (pares/mediaPares));
	       System.out.println("La media de impares es: " + (impares/mediaImpares));
	       System.out.println("Los ceros son: " + ceros);
	   
	   
	  

		
	
	}

}
