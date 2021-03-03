import java.util.Scanner;

public class jejmplo1 {

	private static Object p;

	public static void main(String[] args, Object numero) {
		// TODO Auto-generated method stub

		System.out.print("dame un numero: ");
		System.out.print("dame un segundo numero: ");
	     
		System.out.println("Dime un numero: ");
		Scanner entrada= new Scanner(System.in);
		int num1= entrada.nextInt();
		int num2= entrada.nextInt();
		if (num1%num2==0 || num2%num1==0)
		{
			System.out.println("Son multiplos");
		} else
		{
			System.out.println("No son multiplos");

		}
		entrada.close();

		
	}

}
