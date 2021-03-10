package Abstractas;

public class Principal {

	public static void main(String[] args) {
		
		
		Caza caza1 = new Caza();
		caza1.setModelo("F_19 Hornet");
		caza1.setNum_misiles(2);
		caza1.setPotencia(1000);
		
		System.out.println(caza1);
		
		
		
		
		 AvionPasajeros avion1=new  AvionPasajeros ();
		 avion1.setModelo("Airbu a -300");
		 avion1.setNum_pasajeros(1000);
		 avion1.setTonelaje(90000);
		 
		 
		 System.out.println(avion1);
		 
		 Caza caza2= new Caza();
		 
			 if (caza1.equals(caza2)) {
					System.out.println("Son iguales");
				}
				else
				{
					System.out.println("No son iguales");
				}

		 }
	}
	
	

