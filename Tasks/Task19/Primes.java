/*
Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).

– isPrefix должен возвращать true, если он начинается с префиксного аргумента.

– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.

– В противном случае верните false.
*/


import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Введите строку");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("Введите префикс или суффикс");
		String fix = in.nextLine();

		int p = Position(fix);//opredelyaem suffix ili prefix

		boolean answer = true;

		if (p == 1) 
		{
			answer = isSuffix(s,fix);
			System.out.println("Суффикс " + answer);
			System.out.println("Префикс false");
		}
			
		if (p == 2) 
		{
			answer = isPrefix(s,fix);
			System.out.println("Префикс " + answer);
			System.out.println("Суффикс false");
		}

		if (p == 0) 
		{
			System.out.println("Префикс false");
			System.out.println("Суффикс false");
		}



	}

public static int Position(String fix)
	{

		int po = 0;
		if (fix.charAt(0) == '-') po = 1;
		if (fix.charAt(fix.length() - 1) == '-') po = 2;

		return po;
	}

public static boolean isSuffix(String s, String fix)
	{

		String cop = "";

		for (int i = 1; i < fix.length(); i++)
		{
			cop = cop + fix.charAt(i);
		
		}

		return s.contains(cop);
			
	}

public static boolean isPrefix(String s, String fix)
	{

		String cop = "";

		for (int i = 0; i < (fix.length() - 1); i++)
		{
			cop = cop + fix.charAt(i);
		
		}

		return s.contains(cop);
			
	}


}