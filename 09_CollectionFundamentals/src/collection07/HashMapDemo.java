package collection07;

import java.util.HashMap;
import java.util.Map;

//for adding element in map we use put method
//may not display in same sequence as we have added
//in hashmap key's need to be unique

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Long> map = new HashMap<>();
		map.put("Rohit",7022559849L);
		map.put("Virat",7023154787L);
		map.put("Chahal",7011154888L);
		map.put("ABD",7021154999L);
		
		System.out.println(map);

		
	}

}
