/*
�������� �������, ������� ��������� ������ � 
���������� ����� ������ � ������� �� ������� � ���������� ��������, 
�� ����������� ���� �������:

� ���� ����� ������ ������ ����, ������� "������������".

� ���� ������ � ��������� ������� ���������, ������� "���-��� ����.".
*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ������");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		String answer = flipEndChars(s);
		System.out.println(answer);
		


		


	}

public static String flipEndChars(String s)
	{
		
		String otvet = "", a = "", b = "";

		if ((s.length() - 1) < 2) otvet = nesovmestimo(s);

		else if (s.charAt(0) == s.charAt(s.length() - 1)) otvet = twoPairs(s);

		else 
		{

			b += s.charAt(s.length() - 1);
			a += s.charAt(0);
			otvet += b;
			otvet += s.substring(1, (s.length() - 1));
			otvet += a;
		}

		return otvet;
	}

public static String nesovmestimo(String s)
	{

		String a = "������������";
		return a;

	}

public static String twoPairs(String s)
	{
		String a = "��� - ��� ����";
		return a;

	}
}