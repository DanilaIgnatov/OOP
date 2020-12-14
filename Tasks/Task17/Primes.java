/*
�������� ������� ������� �� 5 ���������������� ����. 
�������� ������, �������� �������, ����� ����������, 
�������� �� ���� �������������� �������� ��������. 
�������������� �������� ������ �������� ��������� �������:

� ������ ��������� ������ ����� (�� ����������� ������������� ���������� ����).

� �� ������ ��������� ������� ��������.

� ����� �� ������ ��������� 5 ����.
*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ������");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		boolean answer = isValid(s);
		System.out.println(answer);
		


		


	}

public static boolean isValid(String s)
	{

		boolean sim = false;	

		boolean l = dlina(s);
		if (l == true) 
		{
			sim = simvol(s);
		}

		return sim;

	}

public static boolean dlina(String s)
	{
		return s.length() < 6;
	}

public static boolean simvol(String s)
	{
		int ind = 0;
		char p;

		for (int i = 0; i < s.length(); i++)
		{

			p = s.charAt(i);
			if (Character.isDigit(p) == true) 
			{
				ind = ind + 0;
			}
			else 
			{
				ind = ind + 1;
			}
		}

		if (ind == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}