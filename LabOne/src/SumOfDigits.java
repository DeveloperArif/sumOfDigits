import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		// scanner to ask user for input

		Scanner sc = new Scanner(System.in);

		// Storing number in string number1 and number2

		String firstNumber, secondNumber;

		// used to calculate digit total

		int digitTotal = -1;

		// valid number to check if user enter valid number

		boolean validNumber = false;

		// while number is not valid

		while (!validNumber) {

			// prompt user

			System.out.print("Enter your first 3-digit number : ");

			firstNumber = sc.nextLine();

			System.out.print("Enter your second 3-digit number : ");

			secondNumber = sc.nextLine();

			// check number length

			if (firstNumber.length() == secondNumber.length()) {

				// parse number to integer

				try {

					int num1 = Integer.parseInt(firstNumber);

					int num2 = Integer.parseInt(secondNumber);

					// check if numbers are positive

					if (num1 < 0 || num2 < 0) {

						System.out.println("Please enter positive number");

					} else {

						// passed all validation

						boolean validNumbers = true;

						// loop through digit by digit from left to right and add the number

						for (int i = 0; i < firstNumber.length(); i++) {

							int digit1 = Integer.parseInt(firstNumber.charAt(i) + "");

							int digit2 = Integer.parseInt(secondNumber.charAt(i) + "");

							System.out.println("Sum of digit at " + (i + 1) + " position : " + (digit1 + digit2));

							// if digit total is not equal to calculated one, set indicator to false

							if (digitTotal < 0) {

								digitTotal = digit1 + digit2;

							} else if (digitTotal != digit1 + digit2) {

								validNumbers = false;

							}

						}

						if (validNumbers) {

							System.out.println("The sum of digits at each position are same!");

						} else {

							System.out.println("The sum of digits at each position are not the same.  Try again");

						}

						validNumber = true;

					}

				} catch (Exception e) {

					// if enter number is not digit it will throw exception

					System.out.println("Please enter number only");

				}

			} else {

				System.out.println("Please enter valid number");

			}

		}

		sc.close();

	}

}