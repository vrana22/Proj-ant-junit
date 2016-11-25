import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testEval() {
		calc obj = new calc();
		int retVal = obj.Eval("2*3*4");
		int expected = 24;
		assertEquals(expected, retVal);
	}

}
