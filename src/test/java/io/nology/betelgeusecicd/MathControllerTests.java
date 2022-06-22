package io.nology.betelgeusecicd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathControllerTests {
	@Test
	public void testRectanglePerimeterReturnsRightPerimeter() {
		MathController controller = new MathController();
		
		Float result = controller.rectanglePerimeter(100f, 200f);
		Float output = 600.0f;
		
		assertTrue(output.equals(result));
	}
}
