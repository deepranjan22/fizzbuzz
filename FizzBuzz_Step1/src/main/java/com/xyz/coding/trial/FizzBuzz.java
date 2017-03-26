package com.xyz.coding.trial;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class FizzBuzz {
	public static final Logger LOGGER = Logger.getLogger(FizzBuzz.class);

	public String printFizzBuzz(int rangeStart, int rangeEnd) throws FizzBuzzException {
		if (rangeEnd < rangeStart) {
			throw new FizzBuzzException("Invalid range - end range value is smaller than start range value");
		}

		boolean isFizz = false;
		boolean isBuzz = false;
		StringBuffer toPrintVal = new StringBuffer();
		for (int count = rangeStart; count <= rangeEnd; count++) {
			if (count % 3 == 0) {
				isFizz = true;
			}
			if (count % 5 == 0) {
				isBuzz = true;
			}

			if (isFizz && isBuzz) {
				toPrintVal.append("fizzbuzz ");
			} else if (isFizz) {
				toPrintVal.append("fizz ");
			} else if (isBuzz) {
				toPrintVal.append("buzz ");
			} else {
				toPrintVal.append(count + " ");
			}

			// reset the flags
			isFizz = false;
			isBuzz = false;
		}
		return toPrintVal.toString().trim();
	}
}
