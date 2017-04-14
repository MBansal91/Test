package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BomberAlgo {
	
	int countLoop = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abbbbbaabcdddeffff";
		System.out.println("Input String length : "+s1.length());
		BomberAlgo b1 = new BomberAlgo();
		b1.bomberAlgo(s1);
	}
	
	public void bomberAlgo(String s1) {
		Boolean finalString = false;
		int length = s1.length();
		char elementToDelete;
		int count = 0;
		char[] c1 =  s1.toCharArray();
		List<Character> l1 = new ArrayList<Character>();
		elementToDelete = c1[0];
		count++;
		for(int i = 1; i<length; ++i) {
			countLoop++;
			if (c1[i] == elementToDelete) {
				count++;
			} else {
				elementToDelete = c1[i];
				count = 1;
			}
			if(count == 3) {
				l1.add(c1[i]);
			}
			}
		if(l1.isEmpty()) {
			finalString = true;
		}
		Iterator<Character> iterator = l1.iterator();
		while(iterator.hasNext()) {
			String temp = iterator.next().toString();
			s1 = s1.replace(temp, "");
		}
		
		if(!finalString) {
			System.out.println("String is : "+s1+ " with total count : "+countLoop);
			bomberAlgo(s1);
		} else {
			System.out.println("Final String is : "+s1+ " with total count : "+countLoop);
		}
	}

}
