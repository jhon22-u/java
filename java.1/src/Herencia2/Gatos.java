package Herencia2;
public class Gatos extends Animal {

	private boolean castrado;
	private char sexo;
	/**
	 * @return the castrado
	 */
	public boolean isCastrado() {
		return castrado;
	}
	/**
	 * @param castrado the castrado to set
	 */
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	private boolean ronronea;


	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Miauu";
	}

	public boolean isRonronea() {
		return ronronea;
	}

	public void setRonronea(boolean ronronea) {
		this.ronronea = ronronea;
	}
	
	
	
}


