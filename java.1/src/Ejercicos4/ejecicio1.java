package Ejercicos4;

import java.util.Scanner;

public class ejecicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = new int[5];
		int crec=0;
		int decr=0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++)
		{
			System.out.println("Escribe un n�mero: ");
			int num = entrada.nextInt();
			array[i]=num;
		}
		
		for(int x=0; x<array.length; x++)
		{
			for(int cont=x+1; cont<array.length; cont++)
			{
				if(array[x]>array[cont])
				{
					decr++;
				} else if(array[x]<array[cont])
				{
					crec++;
				}
			}
		}
						
		if (decr==(array.length+array.length))
		{
			System.out.println("Ordenados de forma decreciente");
		} else if (crec==(array.length+array.length))
		{
			System.out.println("Ordenados de forma creciente");
		} else
		{
			System.out.println("Est�n desordenados");
		}
    }


	
		
		
}


