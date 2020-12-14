/*
Напишите функцию, которая берет последнее число из 
последовательного списка чисел 
и возвращает сумму всех чисел до него и включая его.
*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Введите число");
		Scanner in = new Scanner(System.in);

		System.out.print("Prob ");
		int n = in.nextInt();
		
		int t = addUpTo(n);
		System.out.print(t);

	}

public static int addUpTo(int m)
	{
        	int summ = 0;
		

		for(int i = 1; i < (m + 1); i++)
		{
			summ = summ + i;
		}

		return summ;
	}
}