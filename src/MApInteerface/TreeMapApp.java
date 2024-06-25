package MApInteerface;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapApp {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(5, "bunana");
		map.put(1, "Mango");
		map.put(3, "apple");
		map.put(4, "catburry");
		map.put(2, "xerox");
		
		
		for(Map.Entry<Integer, String> entry:map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
