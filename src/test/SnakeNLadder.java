package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SnakeNLadder {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> ladderMap = new HashMap<>();
		ladderMap.put(3, 22);
		ladderMap.put(11, 26);
		ladderMap.put(5, 8);
		ladderMap.put(20, 29);
		
		HashMap<Integer, Integer> snakeMap = new HashMap<>();
		snakeMap.put(27, 1);
		snakeMap.put(21, 9);
		snakeMap.put(17, 4);
		snakeMap.put(19, 7);
		int i =0;
		int counter = 0;
		ArrayList<Integer> ladderGap = new ArrayList<Integer>();
		Iterator<Integer> iter = ladderMap.keySet().iterator();
		//Check if ladder is there or not on i
		iter = ladderMap.keySet().iterator();
		while(iter.hasNext()){
			int currKey = (Integer)iter.next();
				 ladderGap.add(ladderMap.get(currKey)-currKey);
		}
		Collections.sort(ladderGap);
		System.out.println(ladderGap.size());
		iter = ladderGap.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		/*while(i != 30){
			for(int j = i;j<i+6; ++j){
				//Check if snake is there or not on i
				iter = snakeMap.keySet().iterator();
				while(iter.hasNext()){
					int currKey = (Integer)iter.next();
						if(i == currKey){
						i = snakeMap.get(currKey);
						}
				}
				
				//Check if ladder is there or not on i
				iter = ladderMap.keySet().iterator();
				while(iter.hasNext()){
					int currKey = (Integer)iter.next();
						if(i == currKey){
						i = snakeMap.get(currKey);
						}
				}
			}
			i++;
		}*/
		
		
		
	}

}
