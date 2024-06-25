package MApInteerface;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		Map map=new TreeMap();
		
		map.put("z", 10);
		map.put("y", 20);
		map.put("a", 30);
		map.put("d", 90);
		map.put("k",8);
		map.put("m", 22);
		map.put("map",99);
		map.put("add","Rahul");
		
		Set<String> set=map.keySet();
		
		for(String s:set) {
			System.out.println("Key : "+s+" Values : "+map.get(s));
		}

	}

}
