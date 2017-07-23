package com.java.test.FizzBuzz;

import junit.framework.TestCase;

/**
 * Unit test for FizzBuzz.
 */
public class FizzBuzzTest extends TestCase {

	final String expectedInvalidMsg = "Given input is not a valid number, enter a number from 1 to 1000";
	final String outBoundRangeMsg = "Input is out of range,enter a number from 1 to 1000";

	// verify the Buzz for input 2
	public void testMultipleOfTwoPrintsNumber() {
			assertEquals("2", FizzBuzz.generateFizzOrBuzz(2));
	}
	
	// verify the Buzz for input 5
	public void testMultipleOfFivePrintsBuzz() {
		assertEquals("Buzz", FizzBuzz.generateFizzOrBuzz(5));
	}

	// verify the Fizz for input 3
	public void testMultipleOfThreePrintsFizz() {
		assertEquals("Fizz", FizzBuzz.generateFizzOrBuzz(3));
	}

	// verify the Fizz Buzz for input 15
	public void testMultipleOfFiveAndThreePrintsFizzBuzz() {
		assertEquals("Fizz Buzz", FizzBuzz.generateFizzOrBuzz(15));
	}

	// verify the Fizz Buzz series for input 15
	public void testSeriesRangeTill15() {
		String expectedSeries15 = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz";
		assertEquals(expectedSeries15, FizzBuzz.generateFizzBuzzSeries(String.valueOf(15)));
	}
	
	// verify the Buzz for input 1000
	public void testgenerateFizzBuzzInBoundValueCheckWith1000() {
		assertEquals("Buzz", FizzBuzz.generateFizzOrBuzz(1000));
	}
	
	// verify the msg for input 1001
	public void testgenerateFizzBuzzOutBoundValueCheckWith0() {
				assertEquals(outBoundRangeMsg, FizzBuzz.generateFizzBuzzSeries(String.valueOf("0")));
	}
	// verify the msg for input 1001
	public void testgenerateFizzBuzzOutBoundValueCheckWith1001() {
			assertEquals(outBoundRangeMsg, FizzBuzz.generateFizzBuzzSeries(String.valueOf("1001")));
	}

	// Verify the null reference checks from the input
	public void testgenerateFizzBuzzSeriesNullChecks() {
		assertEquals(expectedInvalidMsg, FizzBuzz.generateFizzBuzzSeries(String.valueOf("")));
	}

	// Verify the special chars checks from the input
	public void testgenerateFizzBuzzSpecialCharChecks() {
		assertEquals(expectedInvalidMsg, FizzBuzz.generateFizzBuzzSeries(String.valueOf("*((&")));
	}

	// Verify the alphaNumeric checks from the input
	public void testgenerateFizzBuzzAlphaNumericChecks() {
		assertEquals(expectedInvalidMsg, FizzBuzz.generateFizzBuzzSeries(String.valueOf("90abc")));
	}

	// Verify the decimal checks from the input
	public void testgenerateFizzBuzzDecimalChecks() {
		assertEquals(expectedInvalidMsg, FizzBuzz.generateFizzBuzzSeries(String.valueOf("1.234")));
	}
	
	// Verify -ve checks from the input
	public void testgenerateFizzBuzzNegativeNumbers() {
			assertEquals(expectedInvalidMsg, FizzBuzz.generateFizzBuzzSeries(String.valueOf("-10")));
	}
	
	// Verify -ve checks from the input
	public void testgenerateFizzBuzzAccentChars() {
				assertEquals(expectedInvalidMsg, FizzBuzz.generateFizzBuzzSeries(String.valueOf("âîô")));
	}
}
