package looping;
import java.util.Scanner;

public class Details {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter Your Details :");
		String name = obj.nextLine();
		System.out.println("User name is :"+name);
		System.out.println("Enter Your Age :");
		int age = obj.nextInt();
		System.out.println("User age is :"+age);
	}
}
