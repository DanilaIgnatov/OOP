/*

�������� �������, ������� ���������, �������� �� ����� 
����� ����������� ������ ��� ���. ����������� ����� - ��� �����, 
������� ����� �������� ��� ����� ��� ����������, �������� ���� �����.

��������, 6-��� ��������� �����, ��� ��� 1 + 2 + 3 = 6, 
��� 1, 2 � 3-��� ������������ 6. ����� ��� �� 28-��� 
����������� �����, ��� ��� 1 + 2 + 4 + 7 + 14 = 28.


*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� �����");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		boolean answer = checkPerfect(n);
		System.out.println(answer);
		


		


	}

public static boolean checkPerfect(int n)
	{
		int dig = 0;
		
		for (int i = 1; i < n; i++)
		{

			if ((n % i) == 0) dig = dig + i;
		}

		if (dig == n) return true;
		else return false;
	}

}