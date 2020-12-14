/*

�������� �������, ������� ��������� ������ � �������� ��������� 
� ���������� true ��� false � ����������� �� ����, 
�������� �� ������� �������� ���� ��������� ������� ����� ������ ��� ���.

*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ����� � �������");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		a = Mass(n);
		boolean ans = isAvgWhole(a, n);

		System.out.println(ans);

	}

public static boolean isAvgWhole(int[] a, int n)
	{

		double count = 0;

		for (int i = 0; i < n; i++)
		{

			count += a[i];

		}

		count = count / n;

		return (count == (int)count);
		

	}

public static int[] Mass(int n)
	{

		int nums[];
		nums = new int[n];


		System.out.println("������� �����");
		Scanner in = new Scanner(System.in); 

		for (int i = 0; i < n; i++)
		{

			nums[i] = in.nextInt();

		}

		return nums;
			
	}
}