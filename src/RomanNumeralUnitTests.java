import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));
		assertEquals("IV", number.toRoman(4));
		assertEquals("X", number.toRoman(10));
		assertEquals("L", number.toRoman(50));
		assertEquals("C", number.toRoman(100));
		assertEquals("CD", number.toRoman(400));
		assertEquals("CM", number.toRoman(900));
		assertEquals("MMMCMXCVIII", number.toRoman(3998));
		
	}
	

}
