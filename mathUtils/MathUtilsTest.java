package mathUtils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils;

	@BeforeEach
	void setUp() throws Exception {
		mathUtils = new MathUtils();
	}

	@Test
	void testadd() {
		assertEquals(55, mathUtils.add(44,11));
	}
	
	@Test
	void testSubtract() {
		assertEquals(55, mathUtils.subtract(100,45));
	}
	
	@Test
	void testMultiply() {
		assertEquals(55, mathUtils.multiply(5,11));
	}
	
	@Test
	void testDivide() {
		assertEquals(55, mathUtils.divide(605,11));
	}
	
	@Test
	void testDivideByZero() {
		assertEquals(-1.0, mathUtils.divide(605,0));
	}

}