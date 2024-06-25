package ArrayPractice;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//List = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
public class ArrayLIstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(10);
		list.add(2);
		list.add(2);
		list.add(10);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(5);
		

		ListIterator i=list.listIterator();
		//forEach(list t)->System.out.println(t);
		list.forEach(k->System.out.println(k));
		ArrayList li=new ArrayList();

		for(int j=0;j<list.size();j++){
				for(int k=j+1;k<list.size();k++) {
				if(list.get(j)==list.get(k)) {
					list.remove(k);
				}
				}
			
		}
		
//			Stream s=list.stream();
//			Stream s1=s.distinct();
//	        List l=(ArrayList)s1.collect(Collectors.toList());
		System.out.println("--------------------------------------------");
		list.forEach(v->System.out.println(v));
		
		
		
	}

}
//
//Input: List = [1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]
//
//
//
//int i j;
//
//ArrayList list = new ArrayList();
//
//list.add(1);
//list.add(10);
//
//		ArrayList l=new ArrayList();
//		ListIterator i=list.listiterator();
//		
//
//		for(j=0;j<list.size;j++){
//
//			if(i.index(j)!=i.index(j+1){
//				l.add(i.next());
//			}
//		}
// 
//HashSet set=new HashSet(list);
//
//
//ArrayList al=set.toArrayList(new ArrayList());