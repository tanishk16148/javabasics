package looping;
import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[]args) {
		int a,n,i=0 ,j=0;
		Scanner an=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=an.nextInt();
		a=n;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if(n==j) {
			System.out.println("Its an Amstrong Number");
		}
		else {
			System.out.println("Its not an Amstrong Number");
		}
	}
}
