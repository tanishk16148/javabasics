package looping;
import java.time.LocalTime;
import java.util.Arrays;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeArray {
	public static void main(String[]args) {
		/*String [] color = {"pink","Yellow","Blue","red"};
		System.out.println(Arrays.toString(color));
		System.out.println(color[1]);*/
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
	}
}
