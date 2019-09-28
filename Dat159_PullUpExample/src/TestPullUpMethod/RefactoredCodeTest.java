package TestPullUpMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import RefactoredCode.RefactoredModularArithmetic;
import RefactoredCode.RefactoredOrdinaryArithmetic;

class RefactoredCodeTest {

	static RefactoredModularArithmetic ModA;
	static RefactoredOrdinaryArithmetic OrdA;
	
	@BeforeAll
	public static void SetUp() {
		ModA = new RefactoredModularArithmetic(15);
		OrdA = new RefactoredOrdinaryArithmetic();
	}
	
	@Test
	void testOrdArithmeticPositiveNumbers() {
		System.out.println("Triying testOrdArithmeticPositiveNumbers");
		assertEquals(50, OrdA.multiplicate(5, 10));
	}
	
	@Test
	void testModArithmeticPositiveNumbers() {
		System.out.println("Triying test Modular ArithmeticPositiveNumbers");
		assertEquals(5, ModA.multiplicate(5, 10));
	}
	
	@Test
	void testOrdArithmeticNegativeNumbers() {
			assertEquals(-50, OrdA.multiplicate(-5, 10));
	}
	
	@Test
	void testModArithmeticNegativeNumbers() {
		System.out.println("Triying test Modular Arithmetic Negative Numbers");
		assertEquals(10, ModA.multiplicate(-5, 10));
	}

}
