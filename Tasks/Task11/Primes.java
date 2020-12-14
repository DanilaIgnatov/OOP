/*
Создайте функцию, которая повторяет каждый символ в строке n раз.
*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Введите строку");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = repeat(s);
		System.out.print(t);

	}

public static String repeat(String s)
	{
		
		System.out.println("Сколько раз повторить строку?");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String summ = ""; 

		for (int j = 0; j < s.length(); j++)
		{
			for (int i = 0; i < n; i++)
			{

				summ = summ + s.charAt(j);

			}

		}


		return summ;
	}
}