/*
Ќапишите функцию, котора€ возвращает самую длинную 
последовательность последовательных нулей в двоичной строке.
*/


import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("¬ведите последовательность нулей и единиц");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		int answer = longestZero(s);
		pechat(answer);
		
		
	}

public static int longestZero(String s)
	{
		int count = 0;
		int maxlt = 0;

		for (int i = 0; i < (s.length() - 1); i++)
		{
		
			if (s.charAt(i) != '1')
			{
				if (s.charAt(i + 1) == '0') count++;

				if (s.charAt(i + 1) == '1') 
				{
			
					count++;
					if (count > maxlt) 
					{
						maxlt = count;
						count = 0;
					}

				}
			}
		
		}


		if ((s.charAt(s.length() - 1)) == '0')
		{

			if (count > maxlt) 
			{
				maxlt = count;
				count = 0;
			}
		}

		return maxlt;

	}

static void pechat(int answer)
{

	String noll = "";
	for(int i = 0; i < answer; i++)
		noll += "0";

	System.out.println(noll);
}


}