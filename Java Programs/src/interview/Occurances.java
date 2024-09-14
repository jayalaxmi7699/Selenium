package interview;

import java.util.HashMap;

public class Occurances {

	static String str = "jaya laxmi";

	public static void main(String[] args) {
		
		HashMap<Character, Integer> hMap = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			} else {
				hMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hMap);
	}

}
