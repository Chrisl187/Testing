package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {
	@Test
	public void testArea() {
		Circle circle = new Circle(0, 0, 5);
		double result = circle.calculateArea();
		Assert.assertEquals(result, 25 * Math.PI);
	}

	@Test
	public void testCircumference() {
		Circle circle = new Circle(0, 0, 5);
		double result = circle.calculateCircumference();
		Assert.assertEquals(result, 10 * Math.PI);
	}
	
	@Test
	public void testAreaAt0() {
		Circle circle = new Circle(0, 0, 0);
		double result = circle.calculateArea();
		Assert.assertEquals(result, 0);
	}

	@Test
	public void testCircumferenceAt0() {
		Circle circle = new Circle(0, 0, 0);
		double result = circle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void testAreaAtMinus() {
		Circle circle = new Circle(0, 0, -5);
		double result = circle.calculateArea();
		Assert.assertEquals(result, 0);
	}

	@Test
	public void testCircumferenceAtMinus() {
		Circle circle = new Circle(0, 0, -9);
		double result = circle.calculateCircumference();
		Assert.assertEquals(result, 0);
	}
}