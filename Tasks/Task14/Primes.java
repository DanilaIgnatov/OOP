/*

�������� �����, ������� ����� ������ ����� ����� � 
���������� ������, � ������� ������ ����� ����� 
�������� ������ ������ ���� + ���� ���������� ����� � �������.

*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ����� � �������");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		cumulativeSum(n);

		System.out.println("");

	}

public static int cumulativeSum(int n)
	{
	
		int nums[];
		nums = new int[n];


		System.out.println("������� �����");
		Scanner in = new Scanner(System.in); 

		for (int i = 0; i < n; i++)
		{

			nums[i] = in.nextInt();

		}

		int nums2[];
		nums2 = new int[n];

		System.out.println("����� ������");

		for (int j = 0; j < n; j++)
		{		

			for (int i = 0; i < (j + 1); i++)
			{
				nums2[j] = nums[i] + nums2[j];
			
			}

		System.out.println(nums2[j]);
		}

		return 0;

	}
}