/*�������� �������, ������� ���������� ����� ���������� ������, 
������� ����� ����� (�������� � ���� ������). 
����� ���� ����� ���������� ����� 
������������� � ������� ���������� ���������� ������.
*/


import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ���������� ����� (���������� ����������� - �����)");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = getDecimalPlaces(s);

		System.out.println("���������� ���������� ������");
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