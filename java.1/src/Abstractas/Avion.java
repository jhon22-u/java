package Abstractas;

public abstract class Avion {

	private double tonelaje;
	private  int potencia;
	private String modelo;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTonelaje() {
		return tonelaje;
	}
	public void setTonelaje(double tonelaje) {
		this.tonelaje = tonelaje;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public String Despegar() {
	return "esto despegando ";
	}
	public String Aterrizar() {
		return " estoy aterrizando";
	}
	
	public abstract String repostar();
	
	
	
	
	
}
