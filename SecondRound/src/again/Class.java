package again;

public class Class {
	
	public void student(int id) {
		System.out.println(id);
	}

	public void student(string name) {
		System.out.println(name);
	}

	public void student(boolean isactive) {
		System.out.println(isactive);
	}
	
	public static void main(String[]args) {
		Class obj =  new Class();
		obj.student(111);
		obj.student("Tanishk");
		obj.student(true);
	}
	
}
