package MApInteerface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		Map map=new HashMap();
		
		map.put(1, 10);
		map.put(2, 30);
		map.put(3, 40);
		map.put(4, 89);
		map.put(5,99);
		Set<Integer> set=map.keySet();
		
		for(int key:set) {
			System.out.println(map.get(key)+" "+key);
		}
	}

}
