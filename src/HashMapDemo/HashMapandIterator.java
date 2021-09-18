package HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapandIterator {

	public static void main(String args[]) {
		// hashMap does not follow no order-no indexing
		// hashMap is store data in key,value format
		// hashMap is not thread-safe
		// hashMap allows only one key as null
		// hashMap can have multiple null value
		// hashMap doesnt allow duplicate key

		HashMap<String, String> CapitalName = new HashMap<String, String>();

		CapitalName.put("India", "New Delhi");
		CapitalName.put("USA", "Washington");
		CapitalName.put("UK", "london");
		CapitalName.put("Russia", null);
		CapitalName.put("France", null);
		CapitalName.put(null, null);
		CapitalName.put(null, "Paris");

		System.out.println(CapitalName);

		// To iterate over the keys: keyset

		Iterator<String> s1 = CapitalName.keySet().iterator();

		while (s1.hasNext()) {

			String key = s1.next();
			String value = CapitalName.get(key);
			System.out.println("key is " + key + "the value is " + value);
		}

		System.out.println("-----------");

		// with for each using lambha function

		CapitalName.forEach((k, v) -> System.out.println("key is " + k + "value is " + v));


	}

}
