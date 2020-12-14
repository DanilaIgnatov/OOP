/*
—оздайте функцию, котора€ находит максимальное 
значение третьего ребра треугольника, 
где длины сторон €вл€ютс€ целыми числами.
*/

import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("¬ведите стороны треугольника");
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