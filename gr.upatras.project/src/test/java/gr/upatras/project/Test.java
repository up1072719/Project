package gr.upatras.project;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void testsubtract() {
		Main tester = new Main();
		assertEquals("NEGATIVE", tester.subtract(104, 150), "104-150 must be negative");
		assertEquals("POSITIVE", tester.subtract(180, 70), "180-70 must be positive");
		}
	

}
