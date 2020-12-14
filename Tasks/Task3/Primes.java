/*
� ���� ������ ������ ������ ��� ������� ���, 
������� ��� ����� ��������� ����� ���� ��� ��������. 
������ �������� ��� ����:

chickens = 2 legs

cows = 4 legs

pigs = 4 legs

������ ��������� ����� ��������, 
� �� ���� ��� ������������� ���� ��� ������� ����. 
�� ������ ����������� �������, ������� ���������� ����� ���������� ��� 
���� ��������.
*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ���������� ��������");
		Scanner in = new Scanner(System.in);

		System.out.print("���� ");
		int n = in.nextInt();
		System.out.println();
		System.out.print("������ ");
		int m = in.nextInt();	
		System.out.println();
		System.out.print("������ ");
		int k = in.nextInt();
		System.out.println();

		int t = animals(n, m, k);
		System.out.println("���������� ��� " + t);
	}


	public static int animals(int t1, int t2, int t3)
	{
        	return ((2 * t1) + (4 * t2) + (4 * t3));
	}
}