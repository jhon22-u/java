package ejercicos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner numero = new Scanner(System.in);
		int n1;
		int n2;
		n1 = numero.nextInt();
		n2 = numero.nextInt();
		char op = '/';
	  System.out.println("el resultado es: ");
	
		switch(op){
		
		case '+':
        System.out.println( n1+ n2 );
        break;

	    case '-':
	        System.out.println( n1 -n2 );
	        break;
	        
	     case '*':
	        System.out.println( n1* n2 );
	        break;
	        
	     case '/':
	           System.out.println( n1 / n2);
	           break;
	      default:
	           System.out.println("error" );
	       break;*/
	// ejemplode profesor 
	           
	  
	        Scanner entrada= new Scanner(System.in) ;
	   		String operacion= entrada.nextLine();
	   		do {
	   		float num1= entrada.nextFloat();
	   		float num2= entrada.nextFloat();
	   	
	   		
	   		if (!operacion.equals("+") && !operacion.equals("-")  && !operacion.equals("/")  && !operacion.equals("/") ) {
				System.out.println("Operacion Incorrecta");
	

	    	 
			
	   		switch(operacion) {
	   	
	   		
	   		case "+": System.out.println("Suma:"+(num1+num2));
			break;
		case "-": System.out.println("Resta:"+(num1-num2));
			break;
		case "/": System.out.println("Division:"+(num1/num2));
			break;
		case "*": System.out.println("Multiplicacion:"+(num1*num2));
		break;		
		
		
	default:
		System.out.println("Operacion Incorrecta");
		while(!operacion.equals("f"));
		entrada.close();
	   		
	   		
	   		}  
	   		
	   		
	   		}
	}
	

	
	        



