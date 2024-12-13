package sample;

public class Son extends Father {
	public void education() {
		System.out.println("engineering");
	}
	
	public static void main(String[] args) {
		Son obj = new Son();
		obj.business();
		obj.education();
		obj.vehical();
	}
}
