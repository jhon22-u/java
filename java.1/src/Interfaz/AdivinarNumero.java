package Interfaz;

import java.util.Scanner;

public class AdivinarNumero implements Juego {

	int numeroAdivinar;

	@Override
	public void iniciar() {
		System.out.println("Dame un numero:");
		numeroAdivinar = (int) ((Math.random() * 100) + 1);

	}

	@Override
	public void jugar() {
		
		boolean encontrado= false;
        do {
        	System.out.print("Adivina el numero:");
    		Scanner n1 = new Scanner(System.in);

    		int numero1 = n1.nextInt();
    		

    		if (numero1 == numeroAdivinar) {
    			System.out.println("diste");
               encontrado= true;
    		} else if (numero1 > numeroAdivinar) {
    			System.out.print("tefalta");
    			encontrado= false;
    		} else if (numero1 < numeroAdivinar) {
    			System.out.print("tefalta un poco mas ");
    			encontrado= false;
    		}
        }while(!encontrado);
		
	}

	@Override
	public void Finalizar() {
		// TODO Auto-generated method stub

	}

}
