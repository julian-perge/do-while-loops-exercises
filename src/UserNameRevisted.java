/*
 * Author: Julian Perge
 * Date: 2018-05-21
 * Desc: Ask the user for a user name of at least 4 characters in length. 
 * Continue prompting the user until they actually enter a user name that is long enough.
 */

import java.util.Scanner;

public class UserNameRevisted
{

	public static void main(String[] args)
	{
		// Find the evens
		Scanner input = new Scanner(System.in);
		String strName = "";
		
		System.out.println("Enter a user name:");
		strName = input.nextLine();

		do
		{
			System.out.println("User name is not long enough. Must be at least 4 characters long.");
			strName = input.nextLine();
			
		} while (strName.length() < 4);
		
		System.out.println("Welcome " + strName + "!");
		
		input.close();
		System.exit(0);

	}

}
