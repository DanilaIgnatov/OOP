/*
�������� �������, ������� ������� ������������ 
�������� �������� ����� ������������, 
��� ����� ������ �������� ������ �������.
*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ������� ������������");
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		
		int t = nextEdge(n, m);
		System.out.print(t);

	}

public static int nextEdge(int n, int m)
	{

		return (n + m - 1);
	}
}