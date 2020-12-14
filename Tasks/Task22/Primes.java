/*
�������� �������, ������� ���������� ������� ������� ��������� " zip " � ������, 
��� -1, ���� ��� �� ���������� �� ������� ���� ������. ��� ��� ������ ���� ���������� �����, 
����� �������� ��� ��������� ������, ����� "zip" ����� ��������� � ������.
*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ������");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();


		int answer = findZip(s);
		if (answer > -2) System.out.println(answer);
		if (answer == -2) System.out.println("������ �� �������� zip");
		


		


	}

public static int findZip(String s)
	{
		int t = -2, count = 0;
		String zip = "zip", copy = "";

		if (s.contains(zip))
		{

			for (int i = 0; i < (s.length() - 3); i++)
			{

				copy = "";
				copy += s.charAt(i);
				copy += s.charAt(i + 1);
				copy += s.charAt(i + 2);
				if (copy.contains(zip))
				{
					t = i;
					count++;
				}

			}

		}

		if (count == 1) t = -1;

		return t;
	}

}