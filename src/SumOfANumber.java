/*
 * Author: Julian Perge
 * Date: 2018-05-21
 * Desc: Prompts the user to enter a low and high integer, calculating the sums between the numbers.
 * e.g. 4 and then 6, 4 + 5 + 6 = 15 
 */

import java.util.Scanner;

public class SumOfANumber
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int finalInt = 0;
		
		System.out.println("Please enter a lower integer and a high integer.");
		int firstNum = input.nextInt();
		
		System.out.println("Second integer:");
		int secondNum = input.nextInt();
		
		if (firstNum > secondNum)
		{
			System.out.println("Second number is lower than the first... Correcting issue, please wait.");
			//if inputs are 6 and 4.
			// 0 = 6
			int intLargest = firstNum;
			// 6 = 4
			firstNum = secondNum;
			// 4 = 6
			secondNum = intLargest;
		}
		else if (firstNum == secondNum)
		{
			finalInt = firstNum;
		}
		
		int iteration = firstNum;
		while (iteration <= secondNum)
		{
			finalInt += iteration;
			++iteration;
		}
		
	/* for (int i = firstNum; i <= secondNum; i++)
		{
			finalInt += i;
		}*/
		
		System.out.println(finalInt);
		
		input.close();

	}

}
