package again;
import java.util.HashMap;

public class Hashmap {
	public static void main(String[]args) {
		HashMap<String,String> country = new HashMap<String,String>();
		country.put("India", "Delhi");
		country.put("Japan", "Tokyo");
		country.put("ThaiLand", "Pataya");
		country.replace("India","Delhi", "Chennai");
		country.remove("Japan");
		System.out.println(country);
	}

}
