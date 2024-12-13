package again;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
	public static void main(String[]args) {
		List<String> obj=new LinkedList();
		obj.add("orange");
		obj.add("yellow");
		obj.addFirst("red");
		obj.addLast("blue");
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj);
		
	}

}
