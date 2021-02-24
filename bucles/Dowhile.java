package bucles;

import java.util.Scanner;

public class Dowhile {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		Scanner numero = null;
		n1=numero.nextInt();
		do {
			System.out.println(n1);
			n1--;
		}
		while(n1>=0);
		numero.close();

	}

}
