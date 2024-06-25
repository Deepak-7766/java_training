package Exception;
import java.util.ArrayList;

import java.util.Iterator;
public class ArrayListHandllingExceptionApp {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Iterator i=list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
