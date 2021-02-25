package variablesyOperadores;

import java.util.Scanner;

public class condiciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);
		int n1;
		int v2;
		int v3;
		n1=numero.nextInt();
        v2=numero.nextInt();
        v3=numero.nextInt();
        
        if (n1> v2) 
        	 System.out.println(n1);
        	 
        
        else 
        	 System.out.println(v2);
        //numero.close();
        
        if (n1> v3)
             System.out.println(n1);
        
        else 
                System.out.println(v3);
        
         
	}
	
	
	
	
	

}
