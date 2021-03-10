package Herencia2;

public class Rapaces extends Pajaros {

	private int  envergadura;
	private  double velocidad;
	
	private int getEnvergadura() {
		return envergadura;
	}
	private void setEnvergadura(int envergadura) {
		this.envergadura = envergadura;
	}
	private double getVelocidad() {
		return velocidad;
	}
	private void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "pio piop";
	}
	
	
}
