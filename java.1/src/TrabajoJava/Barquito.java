package  ejerciciosBuclesArrays ;

import  java.util.Iterator ;
import  java.util.Scanner ;

 Barquitos de clase  p�blica {

	public  static  void  main ( String [] args ) {
		// TODO c�digo auxiliar de m�todo generado autom�ticamente
		
	 // Creo el array del mar
     char barco [] = nuevo  char [ 10 ];
     
     // Rellear el array con -
     para ( int i =  0 ; i < barra . longitud; i ++ ) {
		barco [i] = ' - ' ;
	}
     
     // Genero una posicion teniendo en cuenta el tama�o del barco
     int posicion = ( int ) ( Matem�ticas . aleatorio () * 7 ) + 1 ;
     
     // Pongo el barco en el array 4-5-6
     barra [posici�n] = ' X ' ;
     barra [posici�n + 1 ] = ' X ' ;
     barra [posici�n + 2 ] = ' X ' ;
     
     // Prepara la entrada
     Esc�ner n =  nuevo  esc�ner ( System . In);
     int numero;
     
     // Booleano para salir del bucle
     booleano acierto = falso ;
     hacer
     {
    	 Sistema . fuera . println ( " Introduce una posici�n: " );         
 		 numero = n . nextInt ();
 		 // si la posicion tiene un X, hundido
 		 si (barco [numero] == ' X ' )
 		 {
 	    	 Sistema . fuera . println ( " sabor " );
 	    	 acierto = verdadero ;
 		 }
 			  		
     } mientras ( ! acierto);
     
     // Pintar el bucle
     
     para ( int i = 0 ; i < barra . longitud; i ++ )
    	 Sistema . fuera . imprimir (barco [i]);
	}

}
