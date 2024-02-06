package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTest {
	@Test
	public void testCube() {
		int result1 = Calculation.cube(1);
		int result2 = Calculation.cube(0);
		int result3 = Calculation.cube(5);
		int result4 = Calculation.cube(-9);
		int result5 = Calculation.cube(-1);
		Assert.assertEquals(result1, 1);
		Assert.assertEquals(result2, 0);
		Assert.assertEquals(result3, 125);
		Assert.assertEquals(result4, -729);
		Assert.assertEquals(result5, -1);
	}

	@Test
	public void testReverseWord() {
		String result1 = Calculation.reverseWord("Josef");
		String result2 = Calculation.reverseWord("");
		String result3 = Calculation.reverseWord("!");
		String result4 = Calculation.reverseWord("Rinderkennzeichnungsfleischetikettierungsüberwachungsaufgabenübertragungsgesetz");
		String result5 = Calculation.reverseWord("$%/()");
		String result6 = Calculation.reverseWord("aileruA gam nimrA");
		String result7 = Calculation.reverseWord(" ");
		Assert.assertEquals(result1, "fesoJ");
		Assert.assertEquals(result2, "");
		Assert.assertEquals(result3, "!");
		Assert.assertEquals(result4, "ztesegsgnugartrebünebagfuasgnuhcawrebüsgnureittekitehcsielfsgnunhcieznnekredniR");
		Assert.assertEquals(result5, ")(/%$");
		Assert.assertEquals(result6, "Aurelia mag Armin");
		Assert.assertEquals(result7, " ");
	}

	@Test
	public void testToThePowerOf() {
		double result1 = Calculation.toThePowerOf(3,3);
		double result2 = Calculation.toThePowerOf(3,-2);
		double result3 = Calculation.toThePowerOf(3,0);
		double result4 = Calculation.toThePowerOf(0,3);
		double result5 = Calculation.toThePowerOf(0,-3);
		double result6 = Calculation.toThePowerOf(0,0);
		double result7 = Calculation.toThePowerOf(-2,2);
		double result8 = Calculation.toThePowerOf(-2,-3);
		double result9 = Calculation.toThePowerOf(-2,0);
		Assert.assertEquals(result1, 27);
		Assert.assertEquals(result2, 0,11);
		Assert.assertEquals(result3, 1);
		Assert.assertEquals(result4, 0);
		Assert.assertEquals(result5, 0);
		Assert.assertEquals(result6, 1);
		Assert.assertEquals(result7, 4);
		Assert.assertEquals(result8, 0.125);
		Assert.assertEquals(result9, 1);
	}

	@Test
	public void FindMax() {
		int[] arr1 = {4,5,6,7};
		int result1 = Calculation.findMax(arr1);
		int[] arr2 = {8,5,6,7};
		int result2 = Calculation.findMax(arr2);
		int[] arr3 = {4,9,6,7};
		int result3 = Calculation.findMax(arr3);
		int[] arr4 = {-4,-5,-6,-7};
		int result4 = Calculation.findMax(arr4);
		int[] arr5 = {-4,-5,-6,-1};
		int result5 = Calculation.findMax(arr5);	
		int[] arr6 = {4};
		int result6 = Calculation.findMax(arr6);
		Assert.assertEquals(result1, 7);
		Assert.assertEquals(result2, 8);
		Assert.assertEquals(result3, 9);
		Assert.assertEquals(result4, -4);
		Assert.assertEquals(result5, -1);
		Assert.assertEquals(result6, 4);
	}
}
