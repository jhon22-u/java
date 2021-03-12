package Exepciones;

public class DivisionPorCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int resultado;
		
		
		try {
			resultado = x/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.print(resultado);
		
		
		
	}

}
