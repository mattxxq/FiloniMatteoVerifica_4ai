import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FiloniMatteoTest_A {
	FiloniMatteoClass a = new FiloniMatteoClass();

	@Test
	void test1() {
		assertEquals(a.FiloniMet(5, 7), 210);
		System.out.println(a.FiloniMet(5, 7));

	}

	@Test
	void test2() {
		assertEquals(a.FiloniMet(6, 7), 42);
		System.out.println(a.FiloniMet(6, 7));
	}

	@Test
	void test3() {
		assertEquals(a.FiloniMet(5, 6), 30);
		System.out.println(a.FiloniMet(5, 6));
	}

}
