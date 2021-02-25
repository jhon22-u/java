package ejercicos;

import java.util.Scanner;

@SuppressWarnings("unused")
public class EjemplosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
			
		int[] c1 = new int[5];
		int[] c2 = new int[5];
		
		 c1 [0]=1;
		 c1 [1]=2;
		 c1 [2]=3;
		 c1 [3]=4;
		 c1 [4]=5;
		 
		 
		 for (int i=0; i<5 ; i++)
			 
		 {c2[i]=c1[4-i];
		 	System.out.print(c2[i]);
		 	
		 	
		 	
		 	///
			int[] array1= {23,45,34,67,78};
			
			int[] array2= new int[5];
			
			//Averiguar la longitud del array1
			int longitud=array1.length-1;
			
			//Rellenar ARRAY2
			for(int x=longitud;x>=0;x--) {
				array2[x]=array1[longitud-x];
			}
			
			//Pintar ARRAY
			for (int x=0;x<=longitud;x++) {
				System.out.print(array2[x]+"-");
			}

		}

			
		
		
		
	}   

}
