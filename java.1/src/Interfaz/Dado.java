package Interfaz;

import java.util.Scanner;

public class Dado implements Juego {
    String jugador1;
    String jugador2;
    
    int tirada1;
    int tirada2;
    
	@Override
	public void iniciar(){
		Scanner scaner = new Scanner(System.in);
		jugador1= scaner.next();
		Scanner scaner2 = new Scanner(System.in);
		jugador2= scaner.next();
	}

	@Override
	public void jugar() {
		tirada1 = (int) (Math.random()*6)+1;
		System.out.println("Tirada"+jugador1+":"+tirada1);
		tirada2 = (int) (Math.random()*6)+1;
		System.out.println("Tirada"+jugador2+":"+tirada2);
	}

	@Override
	public void Finalizar() {
		// TODO Auto-generated method stub
   if (tirada1> tirada2) {
        System.out.println("ganador"+tirada1);
   } else if (tirada1< tirada2) {
       System.out.println("ganador"+tirada2);
   } else {
	   System.out.println("empate");
   }
	}

}
