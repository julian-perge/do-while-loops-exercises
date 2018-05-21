/*
 * Author: Julian Perge
 * Date: 2018-05-21
 * Desc: Asks the uesr for a number, displaying the even numbers upto the entered number.
 * e.g. 4 and then 6, 4 + 5 + 6 = 15 
 */

import java.util.Scanner;

public class FindTheEvens
{

	public static void main(String[] args)
	{
		// Find the evens
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number.");
		int inputNum = input.nextInt();
		int amountOfEvens = 0;
		int evens = 2;
		
		while (evens <= inputNum)
		{
			++amountOfEvens;
			System.out.print(evens + " ");
			evens += 2;
		}
		
		System.out.println("\nI just found " + amountOfEvens + " even numbers!");
		
		input.close();
		System.exit(0);

	}

}
