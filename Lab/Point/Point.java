import java.util.Scanner;
import java.math.*;

public class Point {
	public static void main(String[] args)
	{
		/*System.out.println("������� ����� � �������");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(ans);*/

		Point3d myPoint = new Point3d ();//������� ����� (0,0)
		myPoint.displayInfo();

		Point3d myOtherPoint = new Point3d (5,3,7);//������� ����� (5,3)
		myOtherPoint.displayInfo();

		Point3d aThirdPoint = new Point3d ();
		aThirdPoint.displayInfo();

		System.out.println("myPoint = myOtherPoint");
		boolean ans = myPoint.equals(myOtherPoint);
		System.out.println(ans);

		System.out.println("myPoint = aThirdPoint");
		ans = myPoint.equals(aThirdPoint);
		System.out.println(ans);

	}





}