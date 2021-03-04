package TrabajoJava;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println ("Introduce número:");
        //System.out.println ("Introduce número:");
        Scanner teclado= new Scanner(System.in);
       // Scanner teclado1= new Scanner(System.in);
        int num;
       // int numero1;
		
		num = teclado.nextInt();
		//numero1 = teclado1.nextInt();
		
		if(num > 0);{
			for(int i =1;i<= 10; i++) {
				for(int j =0 ;j <= 10; j++) {
				System.out.println(num+"*"+i+"= :"+num*i);
				}
			} System.out.println();
			}
			
			
		
		
		
		
	}
}


