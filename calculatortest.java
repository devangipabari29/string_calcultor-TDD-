package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatortest {

	@Test
	public void emptystring() {
		StringCalculator calc = new StringCalculator();
		assertEquals(0,calc.add(""));
		assertEquals(1,calc.add("1"));
		assertEquals(6,calc.add("6"));
	    assertEquals(3,calc.add("1,2"));
	    assertEquals(6,calc.add("1,5"));
	  
		
	}

}
