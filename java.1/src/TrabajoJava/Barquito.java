package  ejerciciosBuclesArrays ;

import  java.util.Iterator ;
import  java.util.Scanner ;

 Barquitos de clase  pública {

	public  static  void  main ( String [] args ) {
		// TODO código auxiliar de método generado automáticamente
		
	 // Creo el array del mar
     char barco [] = nuevo  char [ 10 ];
     
     // Rellear el array con -
     para ( int i =  0 ; i < barra . longitud; i ++ ) {
		barco [i] = ' - ' ;
	}
     
     // Genero una posicion teniendo en cuenta el tamaño del barco
     int posicion = ( int ) ( Matemáticas . aleatorio () * 7 ) + 1 ;
     
     // Pongo el barco en el array 4-5-6
     barra [posición] = ' X ' ;
     barra [posición + 1 ] = ' X ' ;
     barra [posición + 2 ] = ' X ' ;
     
     // Prepara la entrada
     Escáner n =  nuevo  escáner ( System . In);
     int numero;
     
     // Booleano para salir del bucle
     booleano acierto = falso ;
     hacer
     {
    	 Sistema . fuera . println ( " Introduce una posición: " );         
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
