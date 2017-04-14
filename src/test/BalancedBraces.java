package test;

import java.util.PriorityQueue;
import java.util.Stack;

public class BalancedBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "[{(]}]";
		BalancedBraces balancedBraces = new BalancedBraces();
		System.out.println(balancedBraces.braces(s1));
		
	}
	
	    String braces(String values) {
	        String worked = null;
	            String val = values;
	            String opening = "{[(";
	            String closing = "}])";
	            Stack<String> stack = new Stack<String>();
	            PriorityQueue<Character> priorityQueue = new PriorityQueue<Character>();
	            
	            for(int j=0;j<val.length();++j) {
	                priorityQueue.add(val.charAt(j));
	            }
	            int check = 0; 
	            while(!priorityQueue.isEmpty()){
	                if(opening.contains(priorityQueue.peek().toString())){
	                    stack.add(priorityQueue.poll().toString());
	                } else if(closing.contains(priorityQueue.peek().toString())){
	                    String stackPop = stack.pop().toString();
	                    String QuesuPop = priorityQueue.poll().toString();
	                    if(stackPop.equals("{") && QuesuPop.equals("}")){
	                       continue;
	                    } else if(stackPop.equals("[") && QuesuPop.equals("]")){
	                       continue;
	                    } else if(stackPop.equals("(") && QuesuPop.equals(")")){
	                       continue;
	                    } else {
	                    	System.out.println("stackPop : "+ stackPop + " QuesuPop : " + QuesuPop);
	                        check = -1;
	                        break;
	                    }
	                }
	            }
	            if(check == -1){
	                worked = "No";
	            }

	        if(worked == null){
	            System.out.println("Yes");
	            return "Yes";
	        } else {
	            System.out.println("No");
	            return "No";
	        }
	    }
}
