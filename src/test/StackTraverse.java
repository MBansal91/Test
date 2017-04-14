package test;

import java.util.Iterator;
import java.util.Stack;

public class StackTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.add(10);
		stack.add(1);
		stack.add(5);
		
		stack.push(10);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.add(11);
		Iterator<Integer> iter = stack.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
