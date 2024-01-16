package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
	@Test
	public void testArea() {
		Rectangle rectangle = new Rectangle(0, 0, 5, 5);
		double result = rectangle.calculateArea();
		Assert.assertEquals(result, 25);
	}

	@Test
	public void testCircumference() {
		Rectangle rectangle = new Rectangle(0, 0, 5, 5);
		double result = rectangle.calculateCircumference();
		Assert.assertEquals(result, 20);
	}
	
	@Test
	public void testAreaAt0() {
		Rectangle rectangle = new Rectangle(0, 0, 0, 0);
		double result = rectangle.calculateArea();
		Assert.assertEquals(result, 0);
	}

	@Test
	public void testCircumferenceAt0() {
		Rectangle rectangle = new Rectangle(0, 0, 0, 0);
		double result = rectangle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void testAreaAtMinus() {
		Rectangle rectangle = new Rectangle(0, 0, -2, -80);
		double result = rectangle.calculateArea();
		Assert.assertEquals(result, 0);
	}

	@Test
	public void testCircumferenceAtMinus() {
		Rectangle rectangle = new Rectangle(0, 0, -9, -5);
		double result = rectangle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
	
	
}
