package looping;

public class StringSum {
	public static void main(String[]args) {
		/*String name="pink";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
		
		String fn="tanishk";
		String ln ="A";
		System.out.println(fn.concat(ln));
	}*/
		
		StringBuffer obj = new StringBuffer("hello");
		obj.append("bye");
		System.out.println(obj);
		
		StringBuffer obj1 = new StringBuffer("hello");
		obj1.replace(4,5,"o");
		System.out.println(obj1);
		
		StringBuffer obj2 = new StringBuffer("helloooooo");
		obj2.delete(5,8);
		System.out.println(obj2);
		
		StringBuffer obj3 = new StringBuffer("helloooooo");
		obj3.reverse();
		System.out.println(obj3);
	}
}
