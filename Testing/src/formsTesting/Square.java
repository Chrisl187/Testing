	package formsTesting;

public class Square extends Form {
	
	private double width;
	
	public Square(double x, double y, double width) {
		super(x, y);
		setWidth(width);
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width <= 0) {
			System.err.println("width has to be > 0");
		} else {
			this.width = width;
		}
	}
	
	public double calculateArea() {
		return this.width*this.width;
	}

	public double calculateCircumference() {
		return 4*this.width;
	}
	
	public String toString() {
		return "Square (" + this.getX() + "|" + this.getY() + ") with width = " 
					+ this.width;
	}
}
