/*
 * Author: Julian Perge
 * Date: 2018-05-21
 * Desc: Asks the user for a number, displaying a count from 0 up to the entered number.
 */

import java.util.Scanner;

public class CountItUp
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number.");
		int firstNum = input.nextInt();
		
		int iter = 0;
		while (iter <= 8)
		{
			System.out.print(iter + " ");
			++iter;
		}
		
		System.out.println("\nI just counted to " + firstNum + "!");
		
		System.exit(0);
		
		input.close();

	}

}
