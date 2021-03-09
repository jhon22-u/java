package Herencia2;

public class Animal {

	private int patas;
	String color ;
	
	
	
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String sonido() {
		return "Sonido del animal";

	
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
}
