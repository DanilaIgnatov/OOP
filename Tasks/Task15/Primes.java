/*Создайте функцию, которая возвращает число десятичных знаков, 
которое имеет число (заданное в виде строки). 
Любые нули после десятичной точки 
отсчитываются в сторону количества десятичных знаков.
*/


import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Введите десятичное число (десятичный разделитель - ТОЧКА)");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = getDecimalPlaces(s);

		System.out.println("Количество десятичных знаков");
		System.out.print(n);

	}

public static int getDecimalPlaces(String s)
	{

		int ct = 0; //na kakom meste v stroke tochka
		int c = 0; //kolichestvo cifr posle tochki

		if (s.contains("."))
		{
			for (int i = 0; i < s.length(); i++)
			{

				if (s.charAt(i) == '.') ct = i;
			}

			ct++;

		}

		for (int i = ct; i < s.length(); i++)
		{

			c++;

		}

		if (ct == 0) c = 0;

		return c;
	}
}