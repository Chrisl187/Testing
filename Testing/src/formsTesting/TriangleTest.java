package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {
	@Test
	public void testArea() {
		Triangle triangle = new Triangle(0, 0, 6, 4);
		double result = triangle.calculateArea();
		Assert.assertEquals(result, 12);
	}

	@Test
	public void testCircumference() {
		Triangle triangle = new Triangle(0, 0, 6, 4);
		double result = triangle.calculateCircumference();
		Assert.assertEquals(result, 16);
	}	

	@Test
	public void testAreaAt0() {
		Triangle triangle1 = new Triangle(0, 0, 0, 0);
		Triangle triangle2 = new Triangle(0, 0, 0, 4);
		Triangle triangle3 = new Triangle(0, 0, 6, 0);
		double result1 = triangle1.calculateArea();
		double result2 = triangle2.calculateArea();
		double result3 = triangle3.calculateArea();
		Assert.assertEquals(result1, 0);
		Assert.assertEquals(result2, 0);
		Assert.assertEquals(result3, 0);
	}

	@Test
	public void testCircumferenceAt0() {
		Triangle triangle1 = new Triangle(0, 0, 0, 0);
		Triangle triangle2 = new Triangle(0, 0, 0, 4);
		Triangle triangle3 = new Triangle(0, 0, 6, 0);
		double result1 = triangle1.calculateCircumference();
		double result2 = triangle2.calculateCircumference();
		double result3 = triangle3.calculateCircumference();
		Assert.assertEquals(result1, 0);
		Assert.assertEquals(result2, 0);
		Assert.assertEquals(result3, 0);
	}

	@Test
	public void testAreaAtMinus() {
		Triangle triangle1 = new Triangle(0, 0, -8, -9);
		Triangle triangle2 = new Triangle(0, 0, 5, -4);
		Triangle triangle3 = new Triangle(0, 0, -5, 4);
		double result1 = triangle1.calculateArea();
		double result2 = triangle2.calculateArea();
		double result3 = triangle3.calculateArea();
		Assert.assertEquals(result1, 0);
		Assert.assertEquals(result2, 0);
		Assert.assertEquals(result3, 0);
	}

	@Test
	public void testCircumferenceAtMinus() {
		Triangle triangle1 = new Triangle(0, 0, -8, -9);
		Triangle triangle2 = new Triangle(0, 0, 5, -4);
		Triangle triangle3 = new Triangle(0, 0, -5, 4);
		double result1 = triangle1.calculateCircumference();
		double result2 = triangle2.calculateCircumference();
		double result3 = triangle3.calculateCircumference();
		Assert.assertEquals(result1, 0);
		Assert.assertEquals(result2, 0);
		Assert.assertEquals(result3, 0);
	}
}
