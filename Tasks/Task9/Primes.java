/*
Создайте функцию, которая принимает массив чисел 
и возвращает сумму его кубов.
*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Сколько чисел в массиве");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = sumOfCubes(n);
		System.out.print(t);

	}

public static int sumOfCubes(int n)
	{
		
		int summ = 0;
		int nums[];
		nums = new int[n];


		System.out.println("Введите числа");
		Scanner in = new Scanner(System.in); 

		for (int i = 0; i < n; i++)
		{

			nums[i] = in.nextInt();

		}

		for (int i = 0; i < n; i++)
		{

			summ = summ + (nums[i] * nums[i] * nums[i]);

		}

		return summ;
	}
}