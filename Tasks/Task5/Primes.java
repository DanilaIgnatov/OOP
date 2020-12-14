/*

Напишите функцию, которая принимает 3 числа и возвращает, 
что нужно сделать с a и b: они должны быть сложены, вычитаны, умножены или разделены, 
чтобы получить N. Если ни одна из операций не может дать N, верните "none".
3 числа – это N, a и b.

*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Введите N, a, b");
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

	if (((a + b) == N) || ((N + b) == a) || ((a + N) == b)) as += "Сложение";

	return as;

}

public static String vichitanie(int N, int a, int b)
{
	String as = "";

	if (((a - b) == N) || ((N - b) == a) || ((a - N) == b)) as += "Вычитание";

	return as;

}

public static String umnojenie(int N, int a, int b)
{
	String as = "";

	if (((a * b) == N) || ((N * b) == a) || ((a * N) == b)) as += "Умножение";

	return as;

}

public static String delenie(int N, int a, int b)
{
	String as = "";

	if (((a / b) == N) || ((N / b) == a) || ((a / N) == b)) as += "Деление";

	return as;

}


}