package TrabajoJava;

import java.util.Scanner;

public class JuegoDeAdivinar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		
		int num;
		int x = (int)((Math.random()*100-1)+1);
		boolean check = false;
		
		while(!check) {
			System.out.print("N�mero: ");
			num = sc.nextInt();
			if(x != num) {
				if(num < x) {
					System.out.println("M�s");
				}else {
					System.out.println("Menos");
				}
			}else {
				System.out.println("Acertaste!!");
				System.out.println("El n�mero era el " + x);

		
		
		
		
	}

}
		sc.close();
	}
}
