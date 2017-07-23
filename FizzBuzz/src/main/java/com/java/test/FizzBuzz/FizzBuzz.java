package com.java.test.FizzBuzz;

import java.util.Scanner;

/**
 * To print FizzBuzz series up to a specified number. Replace all multiples of 3
 * with the word "Fizz", all Multiples of 5 with the word "Buzz" And all
 * multiples of 3 and 5 replace with "Fizz Buzz".
 *
 */
public class FizzBuzz {

	/**
	 * Generates FizzBuzz series till the input value
	 * 
	 * @param input
	 * @return FizzBuzz series
	 */
	public static String generateFizzBuzzSeries(String input) {
		String output = "";
		final String invalidInput = "Given input is not a valid number, enter a number from 1 to 1000";
		final String outBoundRange = "Input is out of range,enter a number from 1 to 1000";

		if (input.length() > 0 && (input.charAt(0) >= 48 && input.charAt(0) <= 57)) {
			try {
				int maxValue = Integer.parseInt(input);
				if (maxValue == 0 || maxValue > 1000) {
					output = outBoundRange;
				} else {
					for (int i = 1; i <= maxValue; i++) {
						if (i != maxValue) {
							output += generateFizzOrBuzz(i) + ", ";
						} else {
							output += generateFizzOrBuzz(i);
						}
					}
				}
			} catch (NumberFormatException nfe) {
				output = invalidInput;
			}
		} else {
			output = invalidInput;
		}
		return output;
	}

	/**
	 * Returns number or fizz or Buzz or Fizz Buzz depending on the value
	 * passed.
	 * 
	 * @param number
	 * @return fizz or Buzz or Fizz Buzz or number
	 */
	public static String generateFizzOrBuzz(int number) {

		String fizzOrBuzz = ((number % 15 == 0) ? "Fizz Buzz" : 
			                (number % 3 == 0) ? "Fizz" : 
			                (number % 5 == 0) ? "Buzz" : String.valueOf(number));
		return fizzOrBuzz;
	}

	public static void main(String[] args) {
		// Takes the input from user and validates the input.
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("Enter a number from 1 to 1000 : ");
				String input = scanner.nextLine();

				// Generates FizzBuzz series upto user's input number.
				String series = generateFizzBuzzSeries(input);
				System.out.println(series);
				break;
			}
		} finally {
			scanner.close();
		}
	}

}
