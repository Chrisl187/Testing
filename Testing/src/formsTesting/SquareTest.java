package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
	@Test
	public void testArea() {
		Square square = new Square(0, 0, 5);
		double result = square.calculateArea();
		Assert.assertEquals(result, 25);
	}

	@Test
	public void testCircumference() {
		Square square = new Square(0, 0, 5);
		double result = square.calculateCircumference();
		Assert.assertEquals(result, 20);
	}
	
	@Test
	public void testAreaAt0() {
		Square square = new Square(0, 0, 0);
		double result = square.calculateArea();
		Assert.assertEquals(result, 0);
	}

	@Test
	public void testCircumferenceAt0() {
		Square square = new Square(0, 0, 0);
		double result = square.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void testAreaAtMinus() {
		Square square = new Square(0, 0, -5);
		double result = square.calculateArea();
		Assert.assertEquals(result, 0);
	}

	@Test
	public void testCircumferenceAtMinus() {
		Square square = new Square(0, 0, -9);
		double result = square.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
}
