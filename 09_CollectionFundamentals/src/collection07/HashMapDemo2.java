package collection07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//for adding element in map we use put method
//may not display in same sequence as we have added
//In hashmap key's need to be unique

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<String, Long> map = new HashMap<>();
		map.put("Rohit", 7021154989L);
		map.put("Virat", 7021154787L);
		map.put("Chahal", 7021154888L);
		map.put("ABD", 7021154999L);

		System.out.println(map);

		//overwrites if the hashcode and content is same
		//contract between hashcode and equals method
		map.put("Rohit", 8786463828L);

		// cant apply iterator directly on map hence the below Set..
		Set<Entry<String, Long>> set = map.entrySet();
		Iterator<Entry<String, Long>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, Long> entry = itr.next();
			if(entry.getKey().startsWith("R"))
			{
				System.out.println(entry.getKey().toUpperCase() + " : " + entry.getValue());
			}
			
		}
	}

}
