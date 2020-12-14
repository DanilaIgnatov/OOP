/*
Создайте функцию, которая возвращает значение ASCII переданного символа.
*/
import java.util.Scanner;
import java.math.*;

public class Primes {
	public static void main(String[] args)
	{
		System.out.println("Введите символ");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] ch = s.toCharArray();
		int ascii = ch[0];
		System.out.println(ascii);
	}
}