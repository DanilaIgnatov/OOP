/*
�������� �������, 
������� ��������� ��������� � ������ ������������ 
� ���������� ��� �������.
*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� ��������� � ������");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int h = in.nextInt();
		int p = triArea(a, h);
		System.out.println("������� " + p);
	}


	public static int triArea(int t1, int t2)
	{
        	return (t1 * t2 / 2);
	}
}