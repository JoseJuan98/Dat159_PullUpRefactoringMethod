package TestPullUpMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import OriginalCode.ModularArithmetic;
import OriginalCode.OrdinaryArithmetic;

class OriginalCodeTest {

	
	static ModularArithmetic ModA;
	static OrdinaryArithmetic OrdA;
	
	@BeforeAll
	public static void SetUp() {
		ModA = new ModularArithmetic(15);
		OrdA = new OrdinaryArithmetic();
	}
	
	@Test
	void testOrdArithmeticPositiveNumbers() {
		
		System.out.println("Triying testOrdArithmeticPositiveNumbers");
		assertEquals(50, OrdA.multiplicate(5, 10));
	}
	
	@Test
	void testModArithmeticPositiveNumbers() {
		System.out.println("Triying testModArithmeticPositiveNumbers");
		assertEquals(5, ModA.multiplicate(5, 10));
	}
	
	@Test
	void testOrdArithmeticNegativeNumbers() {
			assertEquals(-50, OrdA.multiplicate(-5, 10));
	}
	
	@Test
	void testModArithmeticNegativeNumbers() {
		assertEquals(10, ModA.multiplicate(-5, 10));
	}
	
}
