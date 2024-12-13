package sample;

public class Daughter extends Father {
	public void education() {
		System.out.println("medical");
	}
	public static void main(String[]args) {
		Daughter obj = new Daughter();
		obj.business();
		obj.education();
	}
}
