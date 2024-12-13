package again;

public class SubMethods {
	public static int addNumbers(int a , int b){
		int result = a + b;
	    return result;
	}
	public static int subNumbers(int a , int b){
		int result = a - b;
	    return result;
	}
	public static int mulNumbers(int a , int b){
		int result = a * b;
	    return result;
	}
	public static int divNumbers(int a , int b){
		int result = a / b;
	    return result;
	}
	public static int modNumbers(int a , int b){
		int result = a % b;
	    return result;
	}
	public static void main(String[] args) {
		int num1 = 89;
	    int num2 = 90;
	    int num3 = 70;
	    int num4 = 60;
	    int num5 = 50;
	    int num6 = 30;
	    
	    
	    int addition = addNumbers(num1,num2);
	    int subraction = subNumbers(num2,num3);
	    int multiplication = mulNumbers(num3,num4);
	    int division = divNumbers(num4,num5);
	    int mod = modNumbers(num5,num6);
	    System.out.println(addition);
	    System.out.println(subraction);
	    System.out.println(multiplication);
	    System.out.println(division);
	    System.out.println(mod);
    }
} 