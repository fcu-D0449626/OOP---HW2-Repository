package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		int a;
		float b;
		String c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer");
		a=scanner.nextInt();
		System.out.println("Enter a float point number");
		b=scanner.nextFloat();
		System.out.println("Enter your name");
		c=scanner.next();
		System.out.printf("HI %s,the multiplication of %d and %.5f is %.2e",c,a,b,a*b);
	}

}