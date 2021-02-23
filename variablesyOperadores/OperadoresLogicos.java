package variablesyOperadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//== != <= >= < >
		
		int z=10;
		int r=9;
		System.out.println(z<r);
		/*
		 * 
		 * && --> AND
		 * || --> OR
		 * ! NOT
		 */
		System.out.print(z>r || z<r);

		
		int i=9;
		int e=11;
		String cadena= i<e? "si":"no";
		System.out.println(cadena);
	
		
	}
	
	
	
	

}
