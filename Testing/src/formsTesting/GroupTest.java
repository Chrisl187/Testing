package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	@Test
	public void testArea() {
		Group group = new Group();
		Square square1 = new Square(0, 0, 5);
		Square square2 = new Square(0, 0, 0);
		Square square3 = new Square(0, 0, -825);
		group.addForm(square1);
		group.addForm(square2);
		group.addForm(square3);
		double result = group.calculateArea();
		Assert.assertEquals(result, 25+0+0);
	}

	@Test
	public void testCircumference() {
		Group group = new Group();
		Square square1 = new Square(0, 0, 5);
		Square square2 = new Square(0, 0, 0);
		Square square3 = new Square(0, 0, -3);
		group.addForm(square1);
		group.addForm(square2);
		group.addForm(square3);
		double result = group.calculateCircumference();
		Assert.assertEquals(result, 20+0+0);
	}
	
	@Test
	public void testFindBiggestForm() {
		Group group = new Group();
		Square square1 = new Square(0, 0, 10);
		Circle circle1 = new Circle(0, 0, 4);
		Rectangle rectangle1 = new Rectangle(0, 0, 4, 8);
		Square square2 = new Square(0, 0, 0);
		Circle circle2 = new Circle(0, 0, 0);
		Rectangle rectangle2 = new Rectangle(0, 0, 0, 0);
		Square square3 = new Square(0, 0, -2);
		Circle circle3 = new Circle(0, 0, -9);
		Rectangle rectangle3 = new Rectangle(0, 0, -8, -36);
		group.addForm(square1);
		group.addForm(circle1);
		group.addForm(rectangle1);
		group.addForm(square2);
		group.addForm(circle2);
		group.addForm(rectangle2);
		group.addForm(square3);
		group.addForm(circle3);
		group.addForm(rectangle3);
		Form result = group.findBiggestForm();
		Assert.assertEquals(result, square1);
	}
	
	@Test
	public void testPrintAll() {
		Group group = new Group();
		Square square1 = new Square(0, 0, 5);
		Square square2 = new Square(0, 0, 0);
		Square square3 = new Square(0, 0, -3);
		group.addForm(square1);
		group.addForm(square2);
		group.addForm(square3);
		group.printForms();
	}
}
