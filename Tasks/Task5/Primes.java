/*

�������� �������, ������� ��������� 3 ����� � ����������, 
��� ����� ������� � a � b: ��� ������ ���� �������, ��������, �������� ��� ���������, 
����� �������� N. ���� �� ���� �� �������� �� ����� ���� N, ������� "none".
3 ����� � ��� N, a � b.

*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("������� N, a, b");
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int a = in.nextInt();	
		int b = in.nextInt();
		String ans = operation(N,a,b);
		System.out.println(ans);
		
	}

public static String operation(int N, int a, int b)
{

	String pr = "";

	pr = slojenie(N,a,b);

	if (pr == "") pr = vichitanie(N,a,b);
	if (pr == "") pr = umnojenie(N,a,b);
	if (pr == "") pr = delenie(N,a,b);
	if (pr == "") pr += "none";

	return pr;

}

public static String slojenie(int N, int a, int b)
{
	String as = "";

	if (((a + b) == N) || ((N + b) == a) || ((a + N) == b)) as += "��������";

	return as;

}

public static String vichitanie(int N, int a, int b)
{
	String as = "";

	if (((a - b) == N) || ((N - b) == a) || ((a - N) == b)) as += "���������";

	return as;

}

public static String umnojenie(int N, int a, int b)
{
	String as = "";

	if (((a * b) == N) || ((N * b) == a) || ((a * N) == b)) as += "���������";

	return as;

}

public static String delenie(int N, int a, int b)
{
	String as = "";

	if (((a / b) == N) || ((N / b) == a) || ((a / N) == b)) as += "�������";

	return as;

}


}