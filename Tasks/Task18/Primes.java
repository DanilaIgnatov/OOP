import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("¬ведите строки");
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();

		boolean answer = isStrangePair(s1, s2);
		System.out.println(answer);
		


		


	}

public static boolean isStrangePair(String s1, String s2)
	{
		
		if ((s1 == "") & (s2 == "")) return true;

		else 
		{
		
		if ((s1 != "") & (s2 != "") & ((s1.charAt(0)) == (s2.charAt(s2.length() - 1))) & ((s2.charAt(0)) == (s1.charAt(s1.length() - 1))))
		{

			return true;

		}

		else 
		{

			return false;

		}

		}

	}

}