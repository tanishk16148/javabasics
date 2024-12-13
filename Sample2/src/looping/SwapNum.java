package looping;

import java.util.Scanner;

public class SwapNum {
	public static void main(String [] args) {
		int a,b,c;
		Scanner sw = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		a=sw.nextInt();
		b=sw.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping the Numbers: ");
		System.out.println(a);
		System.out.println(b);
	}
}
