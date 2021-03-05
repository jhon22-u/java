package Ejercicio3;

import java.util.Scanner;

public class NegaPosiYCeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner num1 =new Scanner(System.in);
		//System.out.println("Dame un numero :");
		//int n0= num1.nextInt();
	//	System.out.println("Dame un numero mas:");
		//int n1= num1.nextInt();
		//System.out.println("Dame un numero mas por favor :");
		//int n2= num1.nextInt();
		//System.out.println("Dame un numero, ya queda menos  :");
		//int n3= num1.nextInt();
		//System.out.println("Dame un numero, el ultimo  :");
	//	int n4= num1.nextInt();
		
		
		
		

		
		
		int [] numero = {1,2,3,-4};
		
		/*numero [0]= n0;
		numero [1]= n1;
		numero [2]= n2;
		numero [3]= n3;
		numero [4]= n4;*/
		
		
		int P=0;
		int N=0;
		int C=0;
		
		for(int i = 0;i < numero.length ; i++) {
			 if (numero[i]> 0){
				 P++;		 }
			 if (numero[i]< -0){
				 N++;		 }
			 if (numero[i]== 0){
				 C++;		 }
		}
		 System.out.println("Numeros positivos "+"="+P);
		 System.out.println("Numeros negativos"+"="+N);
		 System.out.println("Los ceros"+"="+ C);
 
		
		
		
			
	}

}
