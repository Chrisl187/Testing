package formsTesting;

public class Rectangle extends Form {

	private double width;
	private double length;
	
	public Rectangle(double x, double y, double width, double length) {
		super(x, y);
		setWidth(width);
		setLength(length);
		
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

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length <= 0) {
			System.err.println("length has to be > 0");
		} else {
			this.length = length;
		}
	}
	
	public double calculateArea() {
		return this.width*this.length;
	}
	
	public double calculateCircumference() {
		return 2*(this.width+this.length);
	}
	
	public String toString() {
		return "Rectangle (" + this.getX() + "|" + this.getY() + ") with width = " 
					+ this.getWidth() + " and length = " + this.getLength(); 
	}
	
}
