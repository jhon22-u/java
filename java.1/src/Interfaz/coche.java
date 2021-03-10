package Interfaz;

public class coche implements Int_Vehiculo {

	public String frenar(int velocidad) {
		double metros=(velocidad*velocidad)/180;
		return Double.toString(metros);
		}

	public String aceleerar(int velocidad) {
		if (velocidad>  Velosidad_Maxima) {
			return "vas a"+velocidad+ "Kilomtrso"+ Velosidad_Maxima;
		}
		
		return "vas a"+velocidad;
	}

	@Override
	public double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return (duoble);
	}


