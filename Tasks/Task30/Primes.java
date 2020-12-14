import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("¬ведите стороны");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();

		boolean answer = rightTrianglesr(x,y,z);
		System.out.println(answer);
		
	}

public static boolean rightTrianglesr(int x, int y, int z)
	{
		int x1 = 0;
		int y1 = 0;
		int z1 = 0;	


		if ((x > y) & (x > z)) 
			{
				z1 = x;
				y1 = y; 
				x1 = z;
			}

		if ((y > x) & (y > z)) 
			{
				z1 = y;
				y1 = z; 
				x1 = x;
			}

		if ((z > y) & (z > x)) 
			{
				z1 = z;
				y1 = y; 
				x1 = x;
			}

		boolean answer1 = rightTriangle(x1,y1,z1);
		return answer1;
	}

public static boolean rightTriangle(int x1, int y1, int z1)
	{
		return (((x1 * x1) + (y1 * y1)) == (z1 * z1));
	}

}