package formsTesting;

public class Triangle extends Form {

	private double width;
	private double height;

	public Triangle(double x, double y, double width, double height) {
		super(x, y);
		setWidth(width);
		setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width <= 0) {
			System.err.println("width has to be > 0");
		} else {
			this.width = width;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height <= 0) {
			System.err.println("height has to be > 0");
		} else {
			this.height = height;
		}
	}

	public double calculateArea() {
		return this.width * this.height / 2;
	}

	public double calculateCircumference() {
		if(this.width > 0 && this.height > 0) {
			return this.width + 2 * Math.sqrt(Math.pow(this.width / 2, 2) + Math.pow(height, 2));
		}
		return 0;
		
	}

	public String toString() {
		return "Triangle (" + this.getX() + "|" + this.getY() + ") with width = " + this.getWidth() + " and height = "
				+ this.getHeight();
	}
}
