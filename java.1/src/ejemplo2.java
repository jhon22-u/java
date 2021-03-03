import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.print("dame un numero: ");
		System.out.print("dame un segundo numero: ");
		
		
		
		
		 Scanner numero= new Scanner(System.in);
		int n1;
		 Scanner numero2 new Scanner(System.in);
		 int n2;
		  n1 = numero.nextInt();
		  n2 =numero2.nextInt();
		  
		  if( n1>n2) {
			  System.out.print(n1+"y"+n2);
			  
			  
		  } else {
			  System.out.print(n2+""+n1);
		  }
		 
	} 

}
