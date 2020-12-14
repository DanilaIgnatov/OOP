/*
Напишите функцию, которая возвращает true, 
если два массива имеют одинаковое количество уникальных элементов, 
и false в противном случае.
*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Сколько элементов в первом массиве?");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		System.out.println("Введите первый массив");
		int arr1[] = new int[n1];
		int t = n1;
		arr1 = vvodMassiva(t);

		System.out.println("Сколько элементов во втором массиве?");
		int n2 = in.nextInt();
		System.out.println("Введите второй массив");
		int arr2[] = new int[n2];
		t = n2;
		arr2 = vvodMassiva(t);

		//Убираем повторяющиеся элементы в массиве
		
		int arr3[] = new int[n1];
		arr3 = povtor1(arr1);

		int arr4[] = new int[n2];
		arr4 = povtor2(arr2);

		boolean answer = unikalnost(arr3,arr4);
		System.out.println(answer);
		


	}

public static int[] vvodMassiva(int t)
	{
		Scanner in = new Scanner(System.in);

		int arr[] = new int[t];

		for (int i = 0; i < t; i++)
		{

			arr[i] = in.nextInt();

		}

		return arr;

	}

public static int[] povtor1(int[] arr1)
	{

		int c = 0;
		int arr[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++)
		{

			for (int j = 0; j < arr1.length; j++)
			{

				if (i != j)
				{
					if (arr1[i] == arr1[j]) break;
				}

			}

			arr[c] = arr1[i];
			c++;
		}

		return arr;
	}

public static int[] povtor2(int[] arr2)
	{

		int c = 0;
		int arr[] = new int[arr2.length];

		for (int i = 0; i < arr2.length; i++)
		{

			for (int j = 0; j < arr2.length; j++)
			{

				if (i == j) continue;
				else
				{
					if (arr2[i] == arr2[j]) break;
				}

			}

			arr[c] = arr2[i];
			c++;
		}

		return arr;
	}

public static boolean unikalnost(int[] arr3, int[] arr4)
	{

		int c = 0, t = 0;

		for (int i = 0; i < arr4.length; i++)
		{

			for (int j = 0; j < arr3.length; j++)
			{

				if (arr4[i] == arr3[j]) c++;
				else c += 0;

			}

			if (c == 0) t++;		
		}

		return t == arr3.length;

	}

}
