/*

Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2 
различных решения для действительных значений x. 
учитывая a, b и c, вы должны вернуть число решений в уравнение.

*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Введите a, b, c");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int answer = solutions(a, b, c);
		System.out.println(answer);
		


		


	}

public static int solutions(int a, int b, int c)
	{
		
		int D = b * b - 4 * a * c;
		int k = -1;

		if (D > 0) k = 2;

		if (D == 0) k = 1;

		if (D < 0) k = 0;

		return k;

	}

}