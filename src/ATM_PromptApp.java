/*
 * Author: Julian Perge
 * Date: 2018-05-21
 * Desc: Prompts the user to enter their pin number, failing after 3 times.
 */

import java.util.Scanner;

public class ATM_PromptApp
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int failedAttempts = 0;
		final int MAX_FAILED_ATTEMPTS = 3;
		
		System.out.println("ATM B.S. Systems INC.");
		System.out.println("Please create a PIN number.");
		int pinNumber = input.nextInt();
		
		System.out.println("Please enter your PIN number.");
		int userEntry = 0;

		do
		{
			userEntry = input.nextInt();

			if (failedAttempts == MAX_FAILED_ATTEMPTS)
			{
				System.out.println("You have exceeded the max amount of tries. Please wait 5 minutes to try again."
						+ "Terminating current session.");
				System.exit(0);
			}
			else if (userEntry != pinNumber)
			{
				++failedAttempts;
				System.out.println("Incorrect pin, try again.");
				System.out.println("Attempt " + failedAttempts + "/" + MAX_FAILED_ATTEMPTS);
			}
			else
			{
				System.out.println("Thank you for signing in!");
				System.exit(0);
			}
		} while (userEntry != pinNumber);
		
		input.close();

	}

}
