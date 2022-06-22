package io.nology.betelgeusecicd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathControllerTests {
	@Test
	public void testRectanglePerimeterReturnsRightPerimeter() {
		MathController controller = new MathController();
		
		Float result = controller.rectangle_perimeter(100f, 200f);
		Float output = 600.0f;
		
		assertTrue(output.equals(result));
	}
	
	@Test
	public void testCircleAreaReturnsRightArea() {
		MathController controller = new MathController();
		Float result = controller.circleArea(10f);
		Float output = 314.0f;
		
		assertTrue(output.equals(result));
	}
}
