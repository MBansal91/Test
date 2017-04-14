package test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(10);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		Collections.sort(list);
		//Collections.sort(list, Collections.reverseOrder());
		System.out.println("================");
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("================");
		
	}

}
