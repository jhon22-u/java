package Herencia2;

public class Perro extends Animal {

	
	private  boolean castrado;
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isPeligroso() {
		return peligroso;
	}
	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}
	private char sexo;
	private boolean peligroso;
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return super.sonido("gua");
	}
}
