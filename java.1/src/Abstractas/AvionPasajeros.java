package Abstractas;

public class AvionPasajeros extends Avion {

	private int num_pasajeros;
	private int  num_pilotos;
		
	
	public int getNum_pasajeros() {
		return num_pasajeros;
	}


	public void setNum_pasajeros(int num_pasajeros) {
		this.num_pasajeros = num_pasajeros;
	}


	public int getNum_pilotos() {
		return num_pilotos;
	}



	public void setNum_pilotos(int num_pilotos) {
		this.num_pilotos = num_pilotos;
	}

	public double Beneficio(double pvp_billete) {
		return (pvp_billete * num_pasajeros);
	}

   
	@Override
	public String repostar() {
		
		return "En el aeropuerto y en la Base";
	}


	@Override
	public String toString() {
		
		return "Es una avion"+getModelo()+"con modelo de pasageros de"+getNum_pasajeros()+"";
				
	}
	@Override
	public boolean equals(Object obj) {
		// Convertimos obj a AvionPasajeros
		AvionPasajeros Comparado = (AvionPasajeros) obj;

		if (this.getNum_pasajeros() == Comparado.getNum_pasajeros() && this.getModelo() == Comparado.getModelo()) {
			return true;
		} else {
			return false;
		}

	
	
	}
}
