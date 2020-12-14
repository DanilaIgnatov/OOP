/*

Создайте функцию, которая принимает массив и 
возвращает разницу между самыми большими и 
самыми маленькими числами.

*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Сколько чисел в массиве");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = differenceMaxMin(n);

		System.out.println("Разница между большим и малым числом");
		System.out.print(t);

	}

public static int differenceMaxMin(int n)
	{
	
		int nums[];
		nums = new int[n];


		System.out.println("Введите числа");
		Scanner in = new Scanner(System.in); 

		for (int i = 0; i < n; i++)
		{

			nums[i] = in.nextInt();

		}

		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < n; i++)
		{

			if (max > nums[i]) 
			{

				max = nums[i];

			}

			if (min < nums[i]) 
			{

				min = nums[i];

			}
		}

		return (min - max);
	}
}