package Figuras;

public abstract class Figura {

	 private double x;
	    private double y;
	    // constructores 
	     Figura(double x, double y){
	     
	         this.setX(x);
	         this.setY(y);
	     
	     }
	     Figura(double x){
	     
	         this.setX(x);
	     }
//get y set
	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    abstract String area();
	    abstract void pintar();
	    
	    
	}

	
	
	
	
	
	
	

