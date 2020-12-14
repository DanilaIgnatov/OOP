/*
�������� �������, ������� ����������, 
�������� �� ������ ���������� ����������������� �����.

����������������� ��� ������ ���������� � 
��������� ����� # � ����� ����� ����� 6 ��������. 
������ ������ ������ ���� ������ �� 0-9 ��� ��������� �������� �� A-F. 
��� ��������� ������� ����� ���� ���������� ��� ���������.
*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ����");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		boolean answer = isValidHexCode(s);
		System.out.println(answer);
		


		


	}

public static boolean isValidHexCode(String s)
	{
		boolean hash = hashCh(s);
		boolean leng = lengCh(s);
		boolean hexs = hexsCh(s);

		if ((hash == true) & (leng == true) & (hexs == true)) return true;
		else return false;
	}

public static boolean hashCh(String s)
	{
		return (s.charAt(0) == '#');
	}

public static boolean lengCh(String s)
	{
		return (s.length() == 7);
	}

public static boolean hexsCh(String s)
	{
		int count = 0;
		for (int i = 1; i < (s.length()); i++)
		{
			int ascii = s.charAt(i);
			if (((ascii > 64) & (ascii < 71)) || ((ascii > 96) & (ascii < 103)) || ((ascii > 47) & (ascii < 58))) count++;
		}

		return (count == 6);
	}

}
