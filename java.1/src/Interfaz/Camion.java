package Interfaz;

public class Camion implements Int_Vehiculo {

	private int peso;
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String frenar(int velocidad) {
		double metros=(velocidad*velocidad)/180+((this.getPeso()/100)*2);
		return Double.toString(metros);
		}
		
	}

	@Override
	public String aceleerar(int velocidad) {
		String marcha;
		if (velocidad> 0 &&velocidad <20)marcha="";
		if (velocidad>  Velosidad_Maxima) {
			return "vas a"+velocidad+ "Kilomtrso"+ Velosidad_Maxima;
		}
		
		return "vas a"+velocidad;
	}
		
	}

	@Override
	public double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return 0;
	}

}
