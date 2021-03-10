package Herencia2;

public class Periquitos extends Pajaros {

	private boolean cantar;

	public boolean isCantar() {
		return cantar;
	}

	public void setCantar(boolean cantar) {
		this.cantar = cantar;
	}

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "pio pio";
	}
	
	
	
	
	
	
}
