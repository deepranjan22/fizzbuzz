package com.xyz.coding.trial;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest {
	public static final Logger LOGGER = Logger.getLogger(FizzBuzzTest.class);
	private FizzBuzz fizzBuzz;

	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}
	
	@After
    public void tearDown() throws Exception {

    }

	@Test // fizz
	public void testPrintFizzBuzz_Fizz() throws FizzBuzzException {
		String expected = "fizz";
		String actual = fizzBuzz.printFizzBuzz(3, 3);
		Assert.assertEquals(expected, actual);
	}
	
	@Test // buzz
	public void testPrintFizzBuzz_Buzz() throws FizzBuzzException {
		String expected = "buzz";
		String actual = fizzBuzz.printFizzBuzz(5, 5);
		Assert.assertEquals(expected, actual);
	}

	@Test // fizzbuzz
	public void testPrintFizzBuzz_FizzBuzz() throws FizzBuzzException {
		String expected = "fizzbuzz";
		String actual = fizzBuzz.printFizzBuzz(15, 15);
		Assert.assertEquals(expected, actual);
	}

	@Test // range 1- 3
	public void testPrintFizzBuzzRange1_3() throws FizzBuzzException {
		String expected = "1 2 fizz";
		String actual = fizzBuzz.printFizzBuzz(1, 3);
		Assert.assertEquals(expected, actual);
	}

	@Test // range 4 - 5
	public void testPrintFizzBuzzRange4_5() throws FizzBuzzException {
		String expected = "4 buzz";
		String actual = fizzBuzz.printFizzBuzz(4, 5);
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = FizzBuzzException.class) // invalid range 5 - 3
	public void testPrintFizzBuzzRange_Exception() throws FizzBuzzException {
		fizzBuzz.printFizzBuzz(5, 3);
	}

	@Test // range -3 to -1
	public void testPrintFizzBuzzRange_Minus_3_1() throws FizzBuzzException {
		String expected = "fizz -2 -1";
		String actual = fizzBuzz.printFizzBuzz(-3, -1);
		Assert.assertEquals(expected, actual);
	}
}
