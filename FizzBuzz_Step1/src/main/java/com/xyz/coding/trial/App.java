package com.xyz.coding.trial;

import org.apache.log4j.Logger;

public class App {

	public static final Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {
		FizzBuzz fizzBuuzz = new FizzBuzz();
		try {
			String printFizzBuzz = fizzBuuzz.printFizzBuzz(1, 20);
			LOGGER.info(printFizzBuzz);
		} catch (FizzBuzzException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}
}