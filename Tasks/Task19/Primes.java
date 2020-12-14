/*
�������� ��� �������: isPrefix(word, prefix-) � isSuffix (word, -suffix).

� isPrefix ������ ���������� true, ���� �� ���������� � ����������� ���������.

� isSuffix ������ ���������� true, ���� �� ������������� ���������� ��������.

� � ��������� ������ ������� false.
*/


import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ������");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("������� ������� ��� �������");
		String fix = in.nextLine();

		int p = Position(fix);//opredelyaem suffix ili prefix

		boolean answer = true;

		if (p == 1) 
		{
			answer = isSuffix(s,fix);
			System.out.println("������� " + answer);
			System.out.println("������� false");
		}
			
		if (p == 2) 
		{
			answer = isPrefix(s,fix);
			System.out.println("������� " + answer);
			System.out.println("������� false");
		}

		if (p == 0) 
		{
			System.out.println("������� false");
			System.out.println("������� false");
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