package proj1;

import java.util.HashMap;
import java.util.Map;

public class Delivery {

	public static void main(String[] args) { Map<Integer, String> customers = new HashMap<>();
	customers.put(1, "Jhon");
	customers.put(2, "Smith");
	customers.put(3, "Sally");
	
	System.out.println("Delivery Class Ends");

	System.out.println("");
	customers.entrySet().stream().forEach(e ->System.out.println("Key : " + e.getKey() + " value : " + e.getValue())
			
	);}

}
