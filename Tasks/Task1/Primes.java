/*
¬ Java есть единственный оператор, способный обеспечить остаток от операции 
делени€. ƒва числа передаютс€ в качестве параметров. ѕервый параметр, 
разделенный на второй параметр, 
будет иметь остаток, возможно, ноль. ¬ерните это значение.
*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("¬ведите два числа");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int t = remainder(n, m);
		System.out.println("»тог " + t);
	}


	public static int remainder(int t1, int t2)
	{
        	return (t1 % t2);
	}
}