/*

—оздайте функцию, котора€ принимает число (шаг) 
в качестве аргумента и возвращает количество полей 
на этом шаге последовательности.

*/


import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("¬ведите номер шага");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int answer = boxSeq(n);
		System.out.println(answer);
		


		


	}

public static int boxSeq(int n)
	{
		
		int t = 0;

		for (int i = 1; i < (n + 1); i++)
		{

			if ((i % 2) == 0) t = t - 1;
			else t = t + 3;

		}

		return t;

	}

}