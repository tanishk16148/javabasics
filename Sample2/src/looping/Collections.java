package looping;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
	public static void main(String[]args) {
		LinkedList<String> color = new LinkedList<String>();
		color.add("black");
		color.add("blue");
		color.add("red");
		color.add("orange");
		color.set(3,"red");
		color.remove(3);
		color.addFirst("green");
		color.addLast("yellow");
		color.removeFirst();
		color.removeLast();
		System.out.println(color.getFirst());
		System.out.println(color.getLast());
		System.out.println(color);
		System.out.println(color.get(2));
		/*ArrayList<String> color = new ArrayList<String>();
		color.add("black");
		color.add("blue");
		color.add("red");
		color.add("orange");
		color.set(3,"red");
		color.remove(3);
		System.out.println(color);
		System.out.println(color.get(2));*/
	}
}
