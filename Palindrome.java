/**
 * This is a class that checks String inputs to see if they are a Palindrome or not. 
 * If true it returns it is a Palindrome, else vice versa.
 */
import java.util.*;

public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter an input: ");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		Stack palindromeStack = new Stack();
		
		/**
		 * The for loop goes through the input and pushes the character i on top of the stack
		 */
		for(int i = 0; i < input.length(); i++)
		{
			palindromeStack.push(input.charAt(i));
		}
		
		//Setting reverseInput to empty so it can take any string
		String reverseInput = "";
		
		/**
		 * Pops the stack until all the characters have been popped
		 */
		while(palindromeStack.size() > 0)
		{
			reverseInput += palindromeStack.pop();
		}
		
		/**
		 * Checks to see if input is equal to reverseInput
		 */
		if(input.equals(reverseInput))
		{
			System.out.println("The input is a Palindrome.");
		}
		else
		{
			System.out.println("The input is not a Palindrome.");
		}
	}

}
