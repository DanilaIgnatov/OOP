import java.util.Scanner;
import java.math.*;

public class Palindrome {
	public static void main(String[] args)
	{
		System.out.println("¬ведите строку");
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();

		boolean answer = isPalindrome(s1);
		System.out.println(answer);
		


		


	}

public static boolean isPalindrome(String s1)
	{
		
		String s = reverseString(s1);

		return s1.equals(s);
	}

public static String reverseString(String s1)
	{

		String s2 = "";
		for (int i = (s1.length() - 1); i > -1; i--)
		{

			s2 += s1.charAt(i);

		}

		return s2;

	}

}