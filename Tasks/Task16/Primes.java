/*

Создайте функцию, которая при заданном числе 
возвращает соответствующее число Фибоначчи.

*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Сколько чисел Фибоначи?");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = Fibonacci(n);
		System.out.println(t);


		


	}

public static int Fibonacci(int n)
	{
	

		int nums[];
		nums = new int[n + 1];

		nums[0] = 1;
		nums[1] = 1;

		System.out.println("");

		for (int i = 2; i < (n + 1); i++)
		{		

			nums[i] = nums[i - 2] + nums[i - 1];

		}

		return nums[n];

	}
}